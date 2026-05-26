package manejos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JComboBox;

import conexion.Conecta;

public class Manejo_Emprendedor {

	    public void insertar(String nombreAlumno, String apellidoAlumno, String matricula,
	                         String telefono, int semestre, String carrera) {

	        try {
	            Connection con = Conecta.getConexion();

	            String sql = "INSERT INTO \"Emprendedores\" (\"Nombre\", \"Apellido\", \"Matricula\", \"Telefono\", \"Semestre\", \"Carrera\") VALUES (?, ?, ?, ?, ?, ?)";

	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, nombreAlumno);
	            ps.setString(2, apellidoAlumno);
	            ps.setString(3, matricula);
	            ps.setString(4, telefono);
	            ps.setInt(5, semestre);
	            ps.setString(6, carrera);

	            ps.executeUpdate();

	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public void cargarEmprendedores(JComboBox<String> combo) {

	        try {
	            Connection con = Conecta.getConexion();

	            String sql = "SELECT \"ID_Emprendedor\", \"Nombre\", \"Apellido\" FROM \"Emprendedores\"";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ResultSet rs = ps.executeQuery();

	            combo.removeAllItems();

	            while (rs.next()) {

	            	int id = rs.getInt("ID_Emprendedor");
	            	String nombre = rs.getString("Nombre");
	            	String apellido = rs.getString("Apellido");

	                combo.addItem(id + " - " + nombre + " " + apellido);
	            }

	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
