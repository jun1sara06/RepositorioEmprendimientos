package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta {

    private static final String URL = "jdbc:postgresql://db.zyhxxtyhrkczrgahehko.supabase.co:5432/postgres?sslmode=require";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Carolyjuan2026";

    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
