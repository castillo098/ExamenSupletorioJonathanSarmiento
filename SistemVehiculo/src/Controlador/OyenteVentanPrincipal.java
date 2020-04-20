package Controlador;

import Vista.V_RevisionVehicular;
import Vista.V_Vehiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class OyenteVentanPrincipal extends JFrame {

    JMenuBar menu = new JMenuBar();
    JMenu menu1;
    JMenuItem VentanaVehiculo, VentanaRevisionVehiculo, Salir;

    public OyenteVentanPrincipal() {
        dispose();
        setSize(400, 400);
        setLocationRelativeTo(null);
        iniciarComponentes();
        setVisible(true);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
    }

    public JMenuItem getVentanaVehiculo() {
        return VentanaVehiculo;
    }

    public void setVentanaVehiculo(JMenuItem VentanaVehiculo) {
        this.VentanaVehiculo = VentanaVehiculo;
    }

    public JMenuItem getVentanaRevisionVehiculo() {
        return VentanaRevisionVehiculo;
    }

    public void setVentanaRevisionVehiculo(JMenuItem VentanaRevisionVehiculo) {
        this.VentanaRevisionVehiculo = VentanaRevisionVehiculo;
    }

    private void iniciarComponentes() {

        setJMenuBar(menu);
        menu1 = new JMenu("Vehiculo");
        menu.add(menu1);

        VentanaVehiculo = new JMenuItem("Vehiculo");
        VentanaVehiculo.addActionListener(new Principal());
        menu1.add(VentanaVehiculo);

        VentanaRevisionVehiculo = new JMenuItem("Registrar Producto");
        VentanaRevisionVehiculo.addActionListener(new Principal());
        menu1.add(VentanaRevisionVehiculo);

        Salir = new JMenuItem("Salir");
        Salir.addActionListener(new Principal());
        menu1.add(Salir);

    }

    public class Principal implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Salir) {
                System.exit(0);
            }
            if (e.getSource() == VentanaVehiculo) {
                V_Vehiculo v = new V_Vehiculo();

            }
            if (e.getSource() == VentanaRevisionVehiculo) {
                V_RevisionVehicular p = new V_RevisionVehicular();

            }
        }
    }

    public static void main(String[] args) {
        OyenteVentanPrincipal o = new OyenteVentanPrincipal();
    }
}
