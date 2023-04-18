package ProgramaInicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import BDD.Conexion;

public class FuncionComprobarUsuario {
	public boolean comprobar_usuario(String Email,String Contraseña) {
		
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("SELECT COUNT(*) from usuario WHERE Gmail = ?  AND Password = ?");
			stm2.setString(1 , Email);
			stm2.setString(2 , Contraseña);
			
			rs= stm2.executeQuery();
			
			if(rs.next() && rs.getInt(1) > 0) {
				return true;
			}
			
			
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
		return false;
	}
	
	public boolean comprobar_usuario2(String Email) {
		
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("SELECT COUNT(*) from usuario WHERE Gmail = ? ");
			stm2.setString(1 , Email);
			
			rs= stm2.executeQuery();
			
			if(rs.next() && rs.getInt(1) > 0) {
				return true;
			}
			
			
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
		return false;
	}
}
