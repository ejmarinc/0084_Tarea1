package Tarea1ErickMarinCartin;

public class Apuesta{

    private String cedula;
    private String nombre;
    private int numeroDePartido;
    private int montoEquipo1 = 0;
    private int montoEmpate = 0;
    private int montoEquipo2 = 0;
//    Setter methods
    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setNumeroDePartido(int numeroDePartido)
    {
        this.numeroDePartido = numeroDePartido;
    }
    public void setMontoEquipo1 (int montoEquipo1)
    {
        this.montoEquipo1 = montoEquipo1;
    }
    public void setMontoEmpate (int montoEmpate)
    {
        this.montoEmpate = montoEmpate;
    }
    public void setMontoEquipo2 (int montoEquipo2)
    {
        this.montoEquipo2 = montoEquipo2;
    }
}
