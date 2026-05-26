package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conecta {

    public static void main(String[] args) {

        // Datos de conexión
        String url = "jdbc:postgresql://aws-1-us-east-1.pooler.supabase.com:5432/postgres";

        String user = "postgres.zyhxxtyhrkczrgahehko";

        String password = "Carolyjuan2026";

        try {

            // Conectar
            Connection myConn =
                    DriverManager.getConnection(url, user, password);

            System.out.println("CONECTADO A SUPABASE");

            // Crear Statement
            Statement myStmt = myConn.createStatement();

            // Ejecutar consulta
            ResultSet myRs =
                    myStmt.executeQuery("SELECT * FROM \"Emprendedores\"");

            // Mostrar nombres
            while (myRs.next()) {

                System.out.println(myRs.getString("Nombre"));
            }

            // Cerrar recursos
            myRs.close();
            myStmt.close();
            myConn.close();

            System.out.println("CONEXION CERRADA");

        } catch (Exception e) {

            System.out.println("ERROR DE CONEXION");
            e.printStackTrace();
        }
    }
}