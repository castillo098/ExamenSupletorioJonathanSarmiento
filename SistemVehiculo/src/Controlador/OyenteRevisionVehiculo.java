package Controlador;

import Modelo.BD_BaseDatos;
import Modelo.RevisionVehiculo;
import Modelo.Vehiculo;
import Vista.V_RevisionVehicular;
import Vista.V_Vehiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteRevisionVehiculo implements ActionListener {
    
    V_RevisionVehicular vrv;
    BD_BaseDatos base;
    RevisionVehiculo rv;
    
    public OyenteRevisionVehiculo(V_RevisionVehicular vrv) {
        this.vrv = vrv;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        rv = vrv.guardarRevisionVehiculo();
        base.guardarRevisionVehiculo(rv);
        
        vrv.limpiarCampos();
        
    }
    
}
