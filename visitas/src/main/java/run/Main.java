package run;

import util.Conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        conn = Conexion.getConnection();
        if (conn != null) {
            System.out.println("Conexion establecida");
        }else{
            System.out.println("Conexion no establecida");
        }
    }
}
