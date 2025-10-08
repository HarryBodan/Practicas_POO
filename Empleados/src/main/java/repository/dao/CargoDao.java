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
        if (cargo.getId() == null) {
            em.getTransaction().begin();
            em.persist(cargo);
            em.getTransaction().commit();
            return cargo;
        }
        return em.merge(cargo);
    }

    @Override
    public List<Cargo> listar() {
        List<Cargo> lista = em.createQuery("from Cargo", Cargo.class).getResultList();
        return lista;
    }

}
