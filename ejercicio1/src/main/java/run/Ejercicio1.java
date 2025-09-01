package run;

public class Ejercicio1 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Harry Bodán";
        persona.edad = 21;

        System.out.println(persona.mostrarDatos());
    }
}
