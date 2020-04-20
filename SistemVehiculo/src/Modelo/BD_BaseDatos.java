package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BD_BaseDatos {

    public static void guardarVehiculoBD(Vehiculo vehiculo) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/vehiculo", "root", "root");
            System.out.print("Conexion establecida!");

            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into vehiculo values('" + vehiculo.getPlaca()
                    + "','" + vehiculo.getMarca() + "','" + vehiculo.getModelo() + "','" + vehiculo.getColor() + "')");
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.print("Error en la conexion" + e);
        }
    }

    public static void guardarRevisionVehiculo(RevisionVehiculo revisionVehiculo) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/vehiculo", "root", "root");
            System.out.print("Conexion establecida!");

            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into revisionvehicular values('" + revisionVehiculo.getPlaca()
                    + "','" + revisionVehiculo.getFecha() + "','" + revisionVehiculo.getDescripcion() + "')");
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.print("Error en la conexion" + e);
        }
    }

    public static Vehiculo buscarVehiculo(String placa) {
        Vehiculo vehiculo = new Vehiculo();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/vehiculo", "root", "root");
            //System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("Select * from vehiculo  where placa = " + placa);
            while (necesario.next()) {

                String mar = necesario.getString("marca");
                String mod = necesario.getString("modelo");

                vehiculo.setMarca(mar);
                vehiculo.setModelo(mod);
            }
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);

        }
        return vehiculo;
    }
}
