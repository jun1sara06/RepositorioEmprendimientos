package manejos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexion.Conecta;

public class Manejo_Emprendimiento {

	    public void insertar(String nombre, String redSocial, String categoria, int idEmprendedor) {

	        try {
	            Connection con = Conecta.getConexion();

	            if (con == null) {
	                System.out.println("Error de conexión");
	                return;
	            }

	            String sql = "INSERT INTO \"Emprendimientos\" (\"Nombre\", \"Red_Social\", \"Categoria\", \"Emprendedor\") VALUES (?, ?, ?, ?)";

	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, nombre);
	            ps.setString(2, redSocial);
	            ps.setString(3, categoria);
	            ps.setInt(4, idEmprendedor);

	            ps.executeUpdate();

	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public ResultSet consultarPorCategoria(String categoria) {

	        try {
	            Connection con = Conecta.getConexion();

	            String sql = "SELECT e.\"ID_Emprendimiento\", e.\"Nombre\", e.\"Categoria\", e.\"Red_Social\", " +
	                    "em.\"Nombre\" || ' ' || em.\"Apellido\" AS Emprendedor " +
	                    "FROM \"Emprendimientos\" e " +
	                    "JOIN \"Emprendedores\" em ON e.\"Emprendedor\" = em.\"ID_Emprendedor\" " +
	                    "WHERE e.\"Categoria\" = ?";

	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, categoria);

	            return ps.executeQuery();

	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
}

