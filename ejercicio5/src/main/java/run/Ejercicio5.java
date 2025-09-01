package run;

public class Ejercicio5 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.nombre= "Harry Bodán";
        estudiante.matricula = true;
        estudiante.promedio = 78.5;

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre= "Andre Joiner";
        estudiante2.matricula = false;
        estudiante2.promedio = 66.54;

        System.out.println(estudiante.mostrarDatos());
        System.out.println(estudiante.estaAprobado());


        System.out.println(estudiante2.mostrarDatos());
        System.out.println(estudiante2.estaAprobado());
    }
}
