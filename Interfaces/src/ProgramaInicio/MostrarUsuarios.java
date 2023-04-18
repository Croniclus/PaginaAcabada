package ProgramaInicio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import BDD.Conexion;

public class MostrarUsuarios{
    public void Muestra() {
        Conexion conexion = new Conexion();
        Connection cn = null;
        Statement stm = null;
        ResultSet rs = null;

        try {
            cn = conexion.conectar();
            stm = cn.createStatement();
            rs = stm.executeQuery("SELECT * FROM usuario");

            while (rs.next()) {
                String PrimerNombre = rs.getString(1);
                String SegundoNombre = rs.getString(2);
                String Pais = rs.getString(3);
                String Gmail = rs.getString(4);
                String Password= rs.getString(5);

                System.out.println(PrimerNombre + " - " + SegundoNombre + " - " + Pais + " - " + Gmail + " - " + Password);
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
    }
}