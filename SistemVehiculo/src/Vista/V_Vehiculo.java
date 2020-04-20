package Vista;

import Controlador.OyenteGuardarVehiculo;
import Modelo.Vehiculo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V_Vehiculo extends JFrame {

    JPanel panel = new JPanel();
    JLabel label;
    JTextField textoPlaca = new JTextField(20);
    JComboBox comboColor = new JComboBox();
    JTextField textoMarca = new JTextField(20);
    JTextField textoModelo = new JTextField(20);

    JButton btnGuardar = new JButton("Guardar");
    Vehiculo vehiculo;

    public V_Vehiculo() {
        super("Registro Vehiculo");
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
        panel.add(new JLabel("Modelo"), c);
        c.gridx = 1;
        panel.add(textoModelo, c);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(new JLabel("Marca"), c);
        c.gridx = 1;
        panel.add(textoMarca, c);

        Vector color = new Vector();
        color.addElement("");
        color.addElement("Rojo");
        color.addElement("Azul");
        color.addElement("Negro");
        color.addElement("Blanco");

        comboColor = new JComboBox(color);
        comboColor.setPreferredSize(new Dimension(200, 25));

        c.gridx = 0;
        c.gridy = 4;
        panel.add(new JLabel("Color"), c);
        c.gridx = 1;
        panel.add(comboColor, c);

        c.gridx = 1;
        c.gridy = 5;
        panel.add(btnGuardar, c);

        btnGuardar.addActionListener(new OyenteGuardarVehiculo(this));
    }

    public Vehiculo guardarVehiculo() {
        vehiculo = new Vehiculo();
        vehiculo.setPlaca(textoPlaca.getText());
        vehiculo.setModelo(textoModelo.getText());
        vehiculo.setMarca(textoMarca.getText());
        vehiculo.setColor((String) comboColor.getSelectedItem());

        return vehiculo;

    }

    public void limpiarCampos() {
        textoPlaca.setText("");
        textoModelo.setText("");
        textoMarca.setText("");
        comboColor.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        V_Vehiculo v = new V_Vehiculo();
    }
}
