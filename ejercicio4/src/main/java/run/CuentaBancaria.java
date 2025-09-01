package run;

public class CuentaBancaria {
    String titular;
    double saldo;

    public String mostrarDatos() {
        return titular + "\t" + saldo;
    }

    public String depositarDinero(double cantidad){
        this.saldo += cantidad;
        return "Depositado $" + cantidad;
    }

    public String retirarDinero(double cantidad){
        if (this.saldo >= cantidad){
            this.saldo -= cantidad;
            return "Retirado $" + cantidad;
        }else{
            return "Saldo insuficiente!";
        }

    }
}
