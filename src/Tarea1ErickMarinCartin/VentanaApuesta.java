package Tarea1ErickMarinCartin;

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
    private JTextField tfGanancia;
    private JButton ingresarButton;
    public JPanel panelApuesta;


    public void ShowApuestaFrame() {
        JFrame frame = new JFrame("VentanaApuesta");
        frame.setContentPane(new VentanaApuesta().panelApuesta);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public VentanaApuesta(Apuesta Apuesta) {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Apuesta.setCedula(tfCedula.getText());
                Apuesta.setNombre(tfNombre.getText());
                Apuesta.setNumeroDePartido(Integer.parseInt(tfNumero.getText()));
                Apuesta.setMontoEmpate(Float.parseFloat(tfEmpate.getText()));
                Apuesta.setMontoEquipo1(Float.parseFloat(tfApuesta1.getText()));
                Apuesta.setMontoEquipo2(Float.parseFloat(tfApuesta2.getText()));

            }
        });
    }
}
