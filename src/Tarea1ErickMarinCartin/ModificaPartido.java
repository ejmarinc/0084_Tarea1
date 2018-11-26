package Tarea1ErickMarinCartin;

//import com.sun.java.swing.plaf.windows.TMSchema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
//import java.text.SimpleDateFormat;

public class ModificaPartido {
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
    public JPanel PanelPrincipal;
    private JTextField tfFecha;
    private JButton cancelarButton;
//    private List<Apuesta> apuestas;
    private int indice = 0;
    public ModificaPartido(Integer numeroDePartido,List<DatosPartido> partidos, JFrame ventana) {

//        apuestas = new ArrayList<>();

        for (DatosPartido partido : partidos) {
            if (partido.getNumeroDePartido() == numeroDePartido) {
                tfNumeroDePartido.setText(String.valueOf(partido.getNumeroDePartido()));
                tfNombreEquipo1.setText(String.valueOf(partido.getNumeroDePartido()));
                tfCodigoEquipo1.setText(String.valueOf(partido.getCodigoEquipo1()));
                tfCodigoEquipo2.setText(String.valueOf(partido.getCodigoEquipo2()));
                tfNombreEquipo1.setText(partido.getNombreEquipo1());
                tfNombreEquipo2.setText(partido.getNombreEquipo2());
                tfFactorEquipo1.setText(String.valueOf(partido.getFactorEquipo1()));
                tfFactorEquipo2.setText(String.valueOf(partido.getFactorEquipo2()));
                tfGolesEquipo1.setText(String.valueOf(partido.getGolesEquipo1()));
                tfGolesEquipo2.setText(String.valueOf(partido.getGolesEquipo2()));
                tfFactorEmpate.setText(String.valueOf(partido.getFactorEmpate()));
                tfHoraDelPartido.setText(String.valueOf(partido.getHoraPartido()));
                tfFecha.setText(partido.getFechaPartido());


            }
        }


        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Verifica si el numero de Partido ya existe sino da error

                for (DatosPartido partido : partidos) {
                    if (partido.getNumeroDePartido() == numeroDePartido) {

                        partido.setNumeroDePartido(Integer.parseInt(tfNumeroDePartido.getText()));
                        partido.setHoraPartido(tfHoraDelPartido.getText());
                        partido.setFechaPartido(tfFecha.getText());
                        partido.setNombreEquipo1(tfNombreEquipo1.getText());
                        partido.setNombreEquipo2(tfNombreEquipo2.getText());
                        partido.setCodigoEquipo1(Integer.parseInt(tfCodigoEquipo1.getText()));
                        partido.setCodigoEquipo2(Integer.parseInt(tfCodigoEquipo2.getText()));
                        partido.setGolesEquipo1(Integer.parseInt(tfGolesEquipo1.getText()));
                        partido.setGolesEquipo2(Integer.parseInt(tfGolesEquipo2.getText()));
                        partido.setFactorEquipo1(Float.parseFloat(tfFactorEquipo1.getText()));
                        partido.setFactorEquipo2(Float.parseFloat(tfFactorEquipo2.getText()));
                        partido.setFactorEmpate(Float.parseFloat(tfFactorEmpate.getText()));
                        ventana.dispose();
                        CrearArchivoDatosPartido archivoPartidos = new CrearArchivoDatosPartido();
                        archivoPartidos.abrirArchivo();
                        for (DatosPartido partido2 : partidos) {
                            archivoPartidos.agregarRegistro(partido2);
                        }
                        archivoPartidos.cerrarArchivo();
                        DialogDatosIngresados dialog = new DialogDatosIngresados();
                        dialog.pack();
                        dialog.setVisible(true);
                    }
                }


            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                partidos.remove(Partido);
                ventana.dispose();


            }
        });

    }


}
