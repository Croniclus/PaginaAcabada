package ProgramaInicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import BDD.Conexion;

public class FuncionRegistroBDD {
	public void Registrar(String PriNombre,String SegNombre,String Country,String Email,String Contraseña) {
		
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("INSERT INTO usuario(PrimerNombre,SegundoNombre,Pais,Gmail,Password) VALUES (?,?,?,?,?)");
			stm2.setString(1 , PriNombre);
			stm2.setString(2 , SegNombre);
			stm2.setString(3 , Country);
			stm2.setString(4, Email);
			stm2.setString(5, Contraseña);
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
}
