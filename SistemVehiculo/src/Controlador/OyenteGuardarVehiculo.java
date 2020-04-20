package Controlador;

import Modelo.BD_BaseDatos;
import Modelo.Vehiculo;
import Vista.V_Vehiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteGuardarVehiculo implements ActionListener {

    V_Vehiculo vh;
    BD_BaseDatos base;
    Vehiculo vehiculo;

    public OyenteGuardarVehiculo(V_Vehiculo vh) {
        this.vh = vh;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        vehiculo = vh.guardarVehiculo();
        base.guardarVehiculoBD(vehiculo);

        vh.limpiarCampos();

    }

}
