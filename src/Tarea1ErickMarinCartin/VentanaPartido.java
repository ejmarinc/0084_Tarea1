package Tarea1ErickMarinCartin;

//import com.sun.java.swing.plaf.windows.TMSchema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.text.SimpleDateFormat;

public class VentanaPartido {
    private JTextField tfNumeroDePartido;
    private JTextField tfCodigoEquipo1;
    private JTextField tfCodigoEquipo2;
    private JTextField tfNombreEquipo1;
    private JTextField tfNombreEquipo2;
    private JTextField tfFactorEquipo1;
    private JTextField tfFactorEquipo2;
    private JTextField tfGolesEquipo1;
    private JTextField tfGolesEquipo2;
    private JTextField tfFactorEmpate;
    private JTextField tfHoraDelPartido;
    private JButton aceptarButton;
    private JPanel PanelPrincipal;
    private JTextField tfFecha;
    private JButton nuevaApuestaButton;

    public VentanaPartido(DatosPartido Partido) {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Partido.setNumeroDePartido(Integer.parseInt(tfNumeroDePartido.getText()));
                Partido.setHoraPartido(tfHoraDelPartido.getText());
                Partido.setFechaPartido(tfFecha.getText());
                Partido.setNombreEquipo1(tfNombreEquipo1.getText());
                Partido.setNombreEquipo2(tfNombreEquipo2.getText());
                Partido.setCodigoEquipo1(Integer.parseInt(tfCodigoEquipo1.getText()));
                Partido.setCodigoEquipo2(Integer.parseInt(tfCodigoEquipo2.getText()));
                Partido.setGolesEquipo1(Integer.parseInt(tfGolesEquipo1.getText()));
                Partido.setGolesEquipo2(Integer.parseInt(tfGolesEquipo2.getText()));
                Partido.setFactorEquipo1(Float.parseFloat(tfFactorEquipo1.getText()));
                Partido.setFactorEquipo2(Float.parseFloat(tfFactorEquipo2.getText()));
                Partido.setFactorEmpate(Float.parseFloat(tfFactorEmpate.getText()));


                DialogDatosIngresados dialog = new DialogDatosIngresados();
                dialog.pack();
                dialog.setVisible(true);

            }
        });
        nuevaApuestaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frameApuesta = new JFrame("VentanaApuesta");
                frameApuesta.setContentPane(new VentanaApuesta().panelApuesta);
                frameApuesta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameApuesta.pack();
                frameApuesta.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {

//        Crea un objeto de la clase Partido para agregar los datos

        DatosPartido nuevoPartido = new DatosPartido();
//        Crea la ventada para GUI
        JFrame frame = new JFrame("Sistema de Apuestas para Partidos de Fútbol");
        frame.setContentPane(new VentanaPartido(nuevoPartido).PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);






    }
}
