import Tarea1ErickMarinCartin.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class MainWindow {
    private JPanel MainWindow;
    private JButton nuevoPartidoButton;
    private JButton nuevaApuestaButton;
    private JButton imprimirButton;
    private JTabbedPane tabbedPane1;
    private JComboBox comboBoxPartidos;
    private JButton modificarButton;
    private JButton desplegarApuestasButton;
    public static List<DatosPartido> partidos;
    public static List<Apuesta> apuestas;
    public static ArrayList<Integer> listaPartidos;
    int numeroDeApuestas = 0;
    private int numeroDePartidos = 0;
    private int indice = 0;

    public void imprimePartidos() {
        // con print, en vez de println si no quiere cambiar de línea

        for (DatosPartido partido : partidos) {

            System.out.println(partido.getNumeroDePartido());
        }
    }
    public void guardarPartidos()
    {
        // con print, en vez de println si no quiere cambiar de línea

        CrearArchivoDatosPartido archivoPartidos = new CrearArchivoDatosPartido();
        archivoPartidos.abrirArchivo();
        for (DatosPartido partido : partidos) {
            archivoPartidos.agregarRegistro(partido);
        }
        archivoPartidos.cerrarArchivo();


    }

    public void actualizaListaPartidos(){

        listaPartidos.clear();
        for (DatosPartido partido: partidos){
//            System.out.println(partido.getNumeroDePartido());
            listaPartidos.add(partido.getNumeroDePartido());

        }
        comboBoxPartidos.setModel(new DefaultComboBoxModel(listaPartidos.toArray()));

    }

    public Integer obtenerPartidoSeleccionado(){
        Integer partidoSeleccionado =  Integer.parseInt(comboBoxPartidos.getSelectedItem().toString());

        return partidoSeleccionado;
    }

    public MainWindow() {

//        actualizaListaPartidos();
        nuevoPartidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Crea nuevo partido y lo agrega al vector de partidos despues abre GUI form


                DatosPartido nuevoPartido = new DatosPartido();
                partidos.add(nuevoPartido);
                numeroDePartidos=partidos.size();
                JFrame framePartido = new JFrame("AgregarPartido");
                framePartido.setContentPane(new VentanaPartido(nuevoPartido,partidos,framePartido).PanelPrincipal);
                framePartido.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                framePartido.pack();
                framePartido.setVisible(true);



            }
        });
        nuevaApuestaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Apuesta nuevaApuesta = new Apuesta();
                apuestas.add(nuevaApuesta);
                numeroDeApuestas=apuestas.size();
                nuevaApuesta.setNumeroDeApuesta(numeroDeApuestas);


                JFrame frameApuesta = new JFrame("VentanaApuesta");
                frameApuesta.setContentPane(new VentanaApuesta(nuevaApuesta , partidos, apuestas,frameApuesta).panelApuesta);
                frameApuesta.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                frameApuesta.pack();
                frameApuesta.setVisible(true);


            }
        });



//        imprimirButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                guardarPartidos();
//                actualizaListaPartidos();
//            }
//        });

        comboBoxPartidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String partidoSelectionado = (String)comboBoxPartidos.getSelectedItem();
            }
        });
        tabbedPane1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                actualizaListaPartidos();
            }
        });
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String partidoSeleccionado = (String) comboBoxPartidos.getSelectedItem();
//                Integer partidoSeleccionado = 1234;
                JFrame framePartido = new JFrame("ModificarPartido");
                framePartido.setContentPane(new ModificaPartido(obtenerPartidoSeleccionado(),partidos,framePartido).PanelPrincipal);
                framePartido.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                framePartido.pack();
                framePartido.setVisible(true);

            }
        });
        comboBoxPartidos.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
//                System.out.println(obtenerPartidoSeleccionado());
                obtenerPartidoSeleccionado();
            }
        });
    }
    public static void main(String[] args) {

        apuestas = new ArrayList<>();
        partidos = new ArrayList<>();
        listaPartidos = new ArrayList<>();
//        Verifica que el archivo DatosPartido exista, si existe lo abre y carga los registros existentes
        File archivo = new File("DatosPartidos.txt");
        if (archivo.exists()) {
            System.out.println("Leyendo contenido de Archivo DatosPartidos.txt");
            LeerArchivoDatosPartido leerPartidos = new LeerArchivoDatosPartido();
            leerPartidos.abrirArchivo();
            leerPartidos.verRegistros(partidos);
        }


//        Verifica que el archivo DatosPartido exista, si existe lo abre y carga los registros existentes
        File archivoApuesta = new File("DatosApuestas.txt");
        if (archivoApuesta.exists()) {
            System.out.println("Leyendo contenido de archivo DatosApuestas.txt");
            LeerArchivoApuesta leerApuestas = new LeerArchivoApuesta();
            leerApuestas.abrirArchivo();
            leerApuestas.verRegistros(apuestas);
        }

//        Crea la ventada para GUI
        JFrame frame = new JFrame("Sistema de Apuestas para Partidos de Fútbol");
        frame.setContentPane(new MainWindow().MainWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.pack();
        frame.setVisible(true);







    }
}
