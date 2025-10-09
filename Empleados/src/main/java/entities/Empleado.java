package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "empleados")
@Getter @Setter
public class Empleado{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_empleado", length = 100, nullable = false)
    private String nombre;

    @Column(name = "edad_empleado",  length = 500, nullable = false)
    private int edad;

    @Column(name = "carrera_empleado", length= 200, nullable = false)
    private String carrera;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cargo", foreignKey = @ForeignKey(name = "fk_empleado_cargo"))
    private Cargo cargo;

    @Override
    public String toString() {
        return "Datos del empleado" + '\n' +
                "id: " + id +
                "| nombre: '" + nombre + '\n' +
                "| edad: " + edad + '\n' +
                "| carrera: " + carrera + '\n' +
                "| cargo: " + cargo.getNombre() + '\n' +
                "=================================================";
    }
}