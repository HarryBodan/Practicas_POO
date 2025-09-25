package run;

import util.Conexion;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;

        try{
            conn = util.Conexion.get();
            if(conn!=null){
                System.out.println("Conexion exitosa a la base de datos.");
            }else {
                System.out.println("No se ha podido obtener la base de datos.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}