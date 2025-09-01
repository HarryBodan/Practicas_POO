package run;

public class Ejercicio4 {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();
        cb.titular = "Harry Enrique Bodán Navarro";
        cb.saldo = 500;

        System.out.println(cb.mostrarDatos());
        System.out.println(cb.retirarDinero(1000.25));
        System.out.println(cb.depositarDinero(1050.75));
        System.out.println(cb.retirarDinero(1000.25));
        System.out.println(cb.mostrarDatos());
    }
}
