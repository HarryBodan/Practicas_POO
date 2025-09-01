package run;

public class Ejercicio2 {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "Toyota";
        coche.modelo = "Prado";
        coche.anio = 2025;

        System.out.println(coche.mostrarCoche());
    }
}
