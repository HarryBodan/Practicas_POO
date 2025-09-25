package models;


public class Perro extends Animal {

    // Constructor con valores predeterminados
    public Perro() {
        super("Rocco", "¡Guau!", "C:/videos/perro.mp4");
    }

    // Constructor personalizado
    public Perro(String nombre, String rutaVideo) {
        super(nombre, "¡Guau!", rutaVideo);
    }
}
