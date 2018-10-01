package Tarea1ErickMarinCartin;

//import com.sun.java.swing.plaf.windows.TMSchema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaApuesta {
    private JTextField tfCedula;
    private JTextField tfNombre;
    private JTextField tfNumero;
    private JTextField tfApuesta1;
    private JTextField tfApuesta2;
    private JTextField tfEmpate;
    private JButton ingresarButton;
    public JPanel panelApuesta;


//    public void ShowApuestaFrame() {
//        JFrame frame = new JFrame("VentanaApuesta");
//        frame.setContentPane(new VentanaApuesta().panelApuesta);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }

    public VentanaApuesta(Apuesta Apuesta, DatosPartido Partido, JFrame ventana) {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Apuesta.setCedula(tfCedula.getText());
                Apuesta.setNombre(tfNombre.getText());
                Apuesta.setNumeroDePartido(Integer.parseInt(tfNumero.getText()));
                Apuesta.setMontoEmpate(Float.parseFloat(tfEmpate.getText()));
                Apuesta.setMontoEquipo1(Float.parseFloat(tfApuesta1.getText()));
                Apuesta.setMontoEquipo2(Float.parseFloat(tfApuesta2.getText()));
                Apuesta.calcularGanancia(Partido);
                Apuesta.imprimirApuesta();
                ventana.dispose();

                ;

//              Despliega Ventana con los datos de la Apuesta así como los montos apostados y ganancia

            }
        });


    }



}
