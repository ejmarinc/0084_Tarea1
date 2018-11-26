package Tarea1ErickMarinCartin;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class LeerArchivoDatosPartido {
    private Scanner entrada;
    private String nombre;
    private float nota;
    private String registro;
    public void abrirArchivo(){
        try		{
            entrada =  new Scanner(new File("DatosPartidos.txt"));
        }
        catch(Exception ex)		{
            ex.printStackTrace();
        }
    }
    public void verRegistros(List<DatosPartido> partidos)	{
//        System.out.printf("%-30s %4s\n", "Nombre Alumno","Nota");
        while (entrada.hasNext())
        {
            DatosPartido nuevoPartido = new DatosPartido();
            registro = entrada.nextLine();
            System.out.println(registro);
            String[] valor  = registro.split("\\|");
            nuevoPartido.setNumeroDePartido(Integer.parseInt(valor[0]));
            nuevoPartido.setFechaPartido(valor[1]);
            nuevoPartido.setHoraPartido(valor[2]);
            nuevoPartido.setFactorEmpate(Float.parseFloat(valor[3]));
            nuevoPartido.setCodigoEquipo1(Integer.parseInt(valor[4]));
            nuevoPartido.setNombreEquipo1(valor[5]);
            nuevoPartido.setFactorEquipo1(Float.parseFloat(valor[6]));
            nuevoPartido.setGolesEquipo1(Integer.parseInt(valor[7]));
            nuevoPartido.setCodigoEquipo2(Integer.parseInt(valor[8]));
            nuevoPartido.setNombreEquipo2(valor[9]);
            nuevoPartido.setFactorEquipo2(Float.parseFloat(valor[10]));
            nuevoPartido.setGolesEquipo2(Integer.parseInt(valor[11]));
            nuevoPartido.setNumeroDeApuestas(Integer.parseInt(valor[12]));
//Agrega el partido a la lista Array de Partidos
            partidos.add(nuevoPartido);
        }
    }
    public void cerrarArchivo() {
        if (entrada != null)
        {
            entrada.close();
        }
    }
}//Fin clase LeerARchivoDatosPartido

