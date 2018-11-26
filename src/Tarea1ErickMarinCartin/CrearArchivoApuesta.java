package Tarea1ErickMarinCartin;

import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Formatter;

public class CrearArchivoApuesta {
    private Formatter salida; // object used to output text to file
    // Habilita al usuario para abrir el archivo
    public void abrirArchivo()
    {
        try
        {
            salida = new Formatter( "DatosApuestas.txt" );
        } // end try
        catch ( SecurityException securityException )
        {
            System.err.println(
                    "No tiene permisos para escribir en el archivo." );
            System.exit( 1 );
        } // end catch
        catch ( FileNotFoundException filesNotFoundException )
        {
            System.err.println( "Error durante la creación del archivo de apuestas." );
            System.exit( 1 );
        } // end catch
    } // end method abrirArchivo

    public void agregarRegistro(Apuesta Apuesta)
    {

        try
        {
            //Escribe una linea de Partido en el archivo
            for (Field field : Apuesta.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(Apuesta);
                salida.format("%s|", value);
            }
            salida.format("\n");

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }
    public void cerrarArchivo()
    {
        if (salida != null)
        {
            salida.close();
        }
    }



}
