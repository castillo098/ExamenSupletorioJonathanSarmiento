package Controlador;

import Modelo.BD_BaseDatos;
import Modelo.RevisionVehiculo;
import Vista.V_RevisionVehicular;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class OyenteVerificar implements ActionListener {

    V_RevisionVehicular revisionv;
    BD_BaseDatos bd;
    RevisionVehiculo rev;

    public OyenteVerificar(V_RevisionVehicular revisionv) {
        this.revisionv= revisionv;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        rev = bd.buscarVehiculo(revisionv.verificarVehiculo());
        if (rev.getPlaca() == null) {
            vrv.limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(revisionv, "El vehiculo " + rev.getPlaca() + " ya se encuentra registrado");
            revisionv.CargarCampos(rev);
        }
    }

}
