package models;

public class Numero {
    private int num;

    public Numero() {
    }

    public Numero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void esMultiploCuatroyOcho(){
        if(this.num % 4 == 0 && this.num % 8 == 0){
            System.out.println("El numero es multiplo de 4 y 8");
        }else{
            System.out.println("El numero no es multiplo de 4 y 8");
        }
    }
}
