package Tarea1ErickMarinCartin;

//import com.sun.java.swing.plaf.windows.TMSchema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VentanaApuesta {
    private JTextField tfCedula;
    private JTextField tfNombre;
    private JTextField tfNumero;
    private JTextField tfApuesta1;
    private JTextField tfApuesta2;
    private JTextField tfEmpate;
    private JButton ingresarButton;
    public JPanel panelApuesta;
    private JButton cancelarButton;


    public VentanaApuesta(Apuesta Apuesta, List<DatosPartido> partidos,List<Apuesta> apuestas, JFrame ventana) {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Verifica si el numero de Partido existe para aceptar la apuesta
//                Además si existe asigna los datos del partido a la apuesta para calcular la ganancia
                boolean partidoExiste = false;
                boolean partidoYaApostado = false;
                int numeroDePartido = Integer.parseInt(tfNumero.getText());
                String nombre = tfNombre.getText();
                for (DatosPartido partido : partidos) {
                    if (partido.getNumeroDePartido() == numeroDePartido) {
                        partidoExiste = true;
//                      Verifica que el cliente no haya ingresado apuesta en este partido
                        for (Apuesta apuesta : apuestas) {
                            String nombreApuesta = apuesta.getNombre();
                            if (nombreApuesta== nombre && apuesta.getNumeroDePartido()==numeroDePartido ){
                                partidoYaApostado = true;
                            }
                        }
                        if (partidoYaApostado == false) {
//                      Asigna los valores del Partido para calculo de la ganancia
                            Apuesta.setCedula(tfCedula.getText());
                            Apuesta.setNombre(tfNombre.getText());
                            Apuesta.setNumeroDePartido(Integer.parseInt(tfNumero.getText()));
                            Apuesta.setMontoEmpate(Float.parseFloat(tfEmpate.getText()));
                            Apuesta.setMontoEquipo1(Float.parseFloat(tfApuesta1.getText()));
                            Apuesta.setMontoEquipo2(Float.parseFloat(tfApuesta2.getText()));
                            Apuesta.calcularGanancia(partido);
                            Apuesta.imprimirApuesta();
                            ventana.dispose();
                            CrearArchivoApuesta archivoApuesta = new CrearArchivoApuesta();
                            archivoApuesta.abrirArchivo();
                            for (Apuesta apuesta : apuestas) {
                                archivoApuesta.agregarRegistro(apuesta);
                            }
                            archivoApuesta.cerrarArchivo();
                        }

                    }
                }
                if (partidoExiste == false || partidoYaApostado == true) {

                    PartidoNoExiste dialog = new PartidoNoExiste();
                    dialog.pack();
                    dialog.setVisible(true);
                    apuestas.remove(Apuesta);
                    ventana.dispose();
                }
            }
        });


        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apuestas.remove(Apuesta);
                ventana.dispose();
            }
        });
    }



}
