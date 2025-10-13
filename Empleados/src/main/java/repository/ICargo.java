package repository;

import entities.Cargo;
import entities.Empleado;

import java.util.List;

public interface ICargo {
    Cargo guardar(Cargo cargo);
    List<Cargo> listar();
    Cargo buscarPorId(Long id);
    Boolean eliminar(Cargo cargo);
    Cargo editar(Cargo cargo);
}
