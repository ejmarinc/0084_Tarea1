package Tarea1ErickMarinCartin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaApuesta {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton ingresarButton;
    public JPanel panelApuesta;


    public void ShowApuestaFrame() {
        JFrame frame = new JFrame("VentanaApuesta");
        frame.setContentPane(new VentanaApuesta().panelApuesta);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public VentanaApuesta() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
