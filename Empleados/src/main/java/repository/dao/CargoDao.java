package repository.dao;

import entities.Cargo;
import jakarta.persistence.EntityManager;
import repository.ICargo;

import java.util.List;

public class CargoDao implements ICargo {
    private final EntityManager em;

    public CargoDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public Cargo guardar(Cargo cargo) {
        try {
            em.getTransaction().begin();
            Cargo administrado;
            if (cargo.getId() == null) {
                em.persist(cargo);
                administrado = cargo;
            } else {
                administrado = em.merge(cargo);
            }
            em.getTransaction().commit();
            return administrado;
        } catch (RuntimeException e) {
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw e;
        }
    }

    @Override
    public Boolean eliminar(Cargo cargo){
        if(cargo.getId() == null){
            throw new IllegalArgumentException("No se puede eliminar el cargo sin ID");
        }

        try{
            em.getTransaction().begin();
            Cargo administrado = em.find(Cargo.class, cargo.getId());

            if(administrado != null){
                em.getTransaction().commit();
                return false;
            }

            em.remove(administrado);
            em.getTransaction().commit();
            return true;

        }catch(RuntimeException e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw e;
        }
    }

    @Override
    public Cargo editar(Cargo cargo){
        if(cargo.getId() == null){
            throw new IllegalArgumentException("No se puede editar el cargo sin ID");
        }

        try{
            em.getTransaction().begin();
            Cargo existente = em.find(Cargo.class, cargo.getId());

            if(existente != null){
                em.getTransaction().commit();
                return null;
            }

            Cargo editado = em.merge(cargo);
            em.getTransaction().commit();
            return editado;

        }catch (RuntimeException e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw e;
        }
    }

    public Cargo buscarPorId(Long id) {
        return (id == null) ? null : em.find(Cargo.class, id);
    }

    @Override
    public List<Cargo> listar() {
        List<Cargo> lista = em.createQuery("from Cargo", Cargo.class).getResultList();
        return lista;
    }

}
