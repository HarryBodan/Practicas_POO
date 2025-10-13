package repository;

import entities.Empleado;

import java.util.List;

public interface IEmpleado {
    Empleado guardar(Empleado empleado);
    List<Empleado> listar();
    Empleado buscarPorId(Long id);
    Boolean eliminar(Empleado empleado);
    Empleado editar(Empleado empleado);
}
