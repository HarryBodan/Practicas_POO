package models;

public class Gato extends Animal {

    // Constructor con valores predeterminados
    public Gato() {
        super("Luna", "¡Miau!", "C:/videos/gato.mp4");
    }

    // Constructor personalizado
    public Gato(String nombre, String rutaVideo) {
        super(nombre, "¡Miau!", rutaVideo);
    }
}