package util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private final static String url = "jdbc:postgresql://localhost:5432/Visitas";
    private final static String user = "postgres";
    private final static String password = "12345678";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
