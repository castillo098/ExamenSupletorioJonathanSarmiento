/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.OyenteGuardarVehiculo;
import Controlador.OyenteRevisionVehiculo;
import Controlador.OyenteVerificar;
import Modelo.RevisionVehiculo;
import Modelo.Vehiculo;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.beans.Beans;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dell
 */
public class V_RevisionVehicular extends JFrame {

    JPanel panel = new JPanel();
    JLabel label;
    JTextField textoPlaca = new JTextField(20);
    JTextField textoFecha = new JTextField(20);
    JTextField textoMarca = new JTextField(20);
    JTextField textoModelo = new JTextField(20);
    JTextField textoDescripcion = new JTextField(20);
    JTextField textoAño = new JTextField(20);

    JButton btnGuardar = new JButton("Guardar");
    JButton btnVerificar = new JButton("Verificar");
    RevisionVehiculo rv;
    Vehiculo vehiculo;

    public V_RevisionVehicular() {
        super("Revision Vehicular");
        setLocation(200, 100);
        setVisible(true);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        pack();
        agregarComponentes();
    }

    public void agregarComponentes() {

        getContentPane().add(panel);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(10, 15, 10, 15);

        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(10, 15, 10, 15);
        c.gridx = 0;
        c.gridy = 0;
        panel.add(new JLabel("Placa"), c);
        c.gridx = 1;
        panel.add(textoPlaca, c);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(new JLabel("Fecha"), c);
        c.gridx = 1;
        panel.add(textoFecha, c);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(new JLabel("Marca"), c);
        c.gridx = 1;
        panel.add(textoMarca, c);

        c.gridx = 0;
        c.gridy = 3;
        panel.add(new JLabel("Modelo"), c);
        c.gridx = 1;
        panel.add(textoModelo, c);

        c.gridx = 0;
        c.gridy = 4;
        panel.add(new JLabel("Descripcion"), c);
        c.gridx = 1;
        panel.add(textoDescripcion, c);

        c.gridx = 0;
        c.gridy = 5;
        panel.add(new JLabel("Año"), c);
        c.gridx = 1;
        panel.add(textoAño, c);

        c.gridx = 1;
        c.gridy = 6;
        panel.add(btnGuardar, c);

        c.gridx = 2;
        c.gridy = 0;
        panel.add(btnVerificar, c);

        btnGuardar.addActionListener(new OyenteRevisionVehiculo(this));
        btnVerificar.addActionListener(new OyenteVerificar(this));
    }

    public RevisionVehiculo guardarRevisionVehiculo() {
        rv = new RevisionVehiculo();
        rv.setPlaca(textoPlaca.getText());
        rv.setFecha(textoFecha.getText());
        rv.setDescripcion(textoDescripcion.getText());

        return rv;

    }

    public Vehiculo BuscarVehiculo() {
        vehiculo.setPlaca(textoPlaca.getText());
        return vehiculo;
    }

    public void limpiarCampos() {
        textoPlaca.setText("");
        textoModelo.setText("");
        textoMarca.setText("");
        textoDescripcion.setText("");
        textoFecha.setText("");
        textoAño.setText("");
    }

    public String verificarVehiculo() {
        return textoPlaca.getText();
    }

    public void CargarCampos(Vehiculo vehiculo) {
        textoMarca.setText(vehiculo.getMarca());
        textoModelo.setText(vehiculo.getModelo());

    }

    public static void main(String[] args) {
        V_RevisionVehicular v = new V_RevisionVehicular();
    }
}
