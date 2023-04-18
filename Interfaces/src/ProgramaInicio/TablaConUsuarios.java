package ProgramaInicio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BDD.Conexion;

public class TablaConUsuarios {
	private JTable Tabla;
	public TablaConUsuarios(JTable tablaUsuarios) {
		this.Tabla=tablaUsuarios;
	}
	public void MostrarUsuarios() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("PrimerNombre");
		modelo.addColumn("SegundoNombre");
		modelo.addColumn("Pais");
		modelo.addColumn("Gmail");
		modelo.addColumn("Password");

		try {
		Conexion conexion = new Conexion();
		Connection cn = conexion.conectar();
		Statement stm = cn.createStatement();
		ResultSet rs = stm.executeQuery("SELECT * FROM usuario");

		while (rs.next()) {
			
			Object[] fila = new Object[5];
			fila[0] = rs.getString("PrimerNombre");
			fila[1] = rs.getString("SegundoNombre");
			fila[2] = rs.getString("Pais");
			fila[3] = rs.getString("Gmail");
			fila[4] = rs.getString("Password");
			
			modelo.addRow(fila);
			}
	
			Tabla.setModel(modelo);
			
			rs.close();
			cn.close();
			stm.close();

		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
