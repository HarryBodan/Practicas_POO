package run;

public class Ejercicio3 {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.titulo = "100 Años de Soledad";
        libro.autor = "Gabriel García Marquez";
        libro.paginas = "4";

        System.out.println(libro.mostrarDatos());
    }
}
