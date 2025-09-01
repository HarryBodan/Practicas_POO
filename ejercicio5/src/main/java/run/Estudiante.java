package run;

public class Estudiante {
    String nombre;
    boolean matricula;
    double promedio;

    public String mostrarDatos() {
        return nombre + " " + matricula + " " + promedio;
    }

    public String estaAprobado(){
        return (this.promedio >= 70) ? "Aprobado" : "Reprobado";
    }
}
