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
    private JTextField tfNombreEquipoq;
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

    public VentanaPartido(DatosPartido Partido) {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Partido.setCodigoEquipo1(Integer.parseInt(tfCodigoEquipo1.getText()));


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
