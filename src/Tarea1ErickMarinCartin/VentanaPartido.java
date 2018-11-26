package Tarea1ErickMarinCartin;

//import com.sun.java.swing.plaf.windows.TMSchema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
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
    public JPanel PanelPrincipal;
    private JTextField tfFecha;
    private JButton cancelarButton;
    private List<Apuesta> apuestas;
    private int indice = 0;
    public VentanaPartido(DatosPartido Partido,List<DatosPartido> partidos, JFrame ventana) {

        apuestas = new ArrayList<>();

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Verifica si el numero de Partido ya existe sino da error
                boolean partidoExiste = false;
                int numeroDePartido = Integer.parseInt(tfNumeroDePartido.getText());
                for (DatosPartido partido : partidos) {
                    if (partido.getNumeroDePartido()==numeroDePartido){
                        partidoExiste = true;
                        System.out.println("Error partido ya existe");
                        System.out.println(partido.getNumeroDePartido());
                    }
                }
                if (partidoExiste == false) {
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
                    ventana.dispose();
                    CrearArchivoDatosPartido archivoPartidos = new CrearArchivoDatosPartido();
                    archivoPartidos.abrirArchivo();
                    for (DatosPartido partido : partidos) {
                        archivoPartidos.agregarRegistro(partido);
                    }
                    archivoPartidos.cerrarArchivo();



                    DialogDatosIngresados dialog = new DialogDatosIngresados();
                    dialog.pack();
                    dialog.setVisible(true);
                }
                else {
                    PartidoExiste dialog = new PartidoExiste();
                    dialog.pack();
                    dialog.setVisible(true);
                    partidos.remove(Partido);
                }

            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                partidos.remove(Partido);
                ventana.dispose();


            }
        });


    }


}
