package ProgramaInicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import BDD.Conexion;

public class Borrar {
	public void borrarTabla(String Gmail) {
	            Conexion conexion = new Conexion();
	            Connection cn = null;
	            PreparedStatement ps = null;

	            try {
	                cn = conexion.conectar();
	                ps = cn.prepareStatement("DELETE FROM usuario WHERE Gmail= ?");
	                ps.setString(1, Gmail);

	                int resultado = ps.executeUpdate();

	                if (resultado > 0) {
	                    System.out.println("El usuario con el Gmail:  " + Gmail + " ha sido borrado");
	                } else {
	                    System.out.println("No se encontró ningún usuario con el Gemail: " + Gmail);
	                }

	            } catch (SQLException e) {
	                e.printStackTrace();
	            } finally {
	                try {
	                    if (ps != null) {
	                        ps.close();
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
