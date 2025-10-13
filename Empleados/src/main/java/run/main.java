package run;

import config.JPAUtil;
import entities.Empleado;
import entities.Cargo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import repository.dao.EmpleadoDao;
import repository.dao.CargoDao;


import java.util.List;

public class main {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();

        Cargo cargo = new Cargo();
        cargo.setNombre("Gerente");
        cargo.setDescripcion("Tiene a su cargo a varias personas");

        CargoDao dao = new CargoDao(em);

        System.out.println(dao.guardar(cargo));

        List<Cargo> cargos = dao.listar();
        for (Cargo c : cargos) {
            System.out.println(c);
        }
        System.out.println("==================================================");

        Empleado empleado = new Empleado();
        empleado.setId(1L);
        empleado.setNombre("Yorleny Guerrero");
        empleado.setCarrera("Sistemas");
        empleado.setEdad(20);
        empleado.setCargo(cargo);

        EmpleadoDao daoEmpleado = new EmpleadoDao(em);

        System.out.println(daoEmpleado.guardar(empleado));

        List<Empleado> empleados = daoEmpleado.listar();
        for (Empleado d : empleados) {
            System.out.println(d);
        }
        System.out.println("==================================================");


    }
}
