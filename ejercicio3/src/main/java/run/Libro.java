package run;

public class Libro {
    String titulo;
    String autor;
    String paginas;

    public String mostrarDatos() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nPaginas: " + paginas;
    }
}
