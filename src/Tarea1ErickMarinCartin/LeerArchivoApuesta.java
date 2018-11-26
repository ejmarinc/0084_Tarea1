package Tarea1ErickMarinCartin;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class LeerArchivoApuesta {
    private Scanner entrada;
    private String nombre;
    private float nota;
    private String registro;
    public void abrirArchivo(){
        try		{
            entrada =  new Scanner(new File("DatosApuestas.txt"));
        }
        catch(Exception ex)		{
            ex.printStackTrace();
        }
    }
    public void verRegistros(List<Apuesta> apuestas)	{

        while (entrada.hasNext())
        {
            Apuesta nuevaApuesta = new Apuesta();
            registro = entrada.nextLine();
            System.out.println(registro);
            String[] valor  = registro.split("\\|");
            nuevaApuesta.setCedula(valor[0]);
            nuevaApuesta.setNombre(valor[1]);
            nuevaApuesta.setNumeroDePartido(Integer.parseInt(valor[2]));
            nuevaApuesta.setMontoEquipo1(Double.parseDouble(valor[3]));
            nuevaApuesta.setMontoEmpate(Double.parseDouble(valor[4]));
            nuevaApuesta.setMontoEquipo2(Double.parseDouble(valor[5]));
            nuevaApuesta.setGanancia(Double.parseDouble(valor[6]));
            nuevaApuesta.setMontoApostado(Double.parseDouble(valor[7]));
            nuevaApuesta.setMontoGanado(Double.parseDouble(valor[8]));
            nuevaApuesta.setNumeroDeApuesta(Integer.parseInt(valor[9]));
            apuestas.add(nuevaApuesta);
        }
    }
    public void cerrarArchivo() {
        if (entrada != null)
        {
            entrada.close();
        }
    }
}//Fin clase VerArchivo1

