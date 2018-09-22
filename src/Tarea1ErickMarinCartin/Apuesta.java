package Tarea1ErickMarinCartin;

import Tarea1ErickMarinCartin.DatosPartido;

public class Apuesta{

    private String cedula;
    private String nombre;
    private int numeroDePartido;
    private double montoEquipo1 = 0;
    private double montoEmpate = 0;
    private double montoEquipo2 = 0;

    private double ganancia; // variable de instancia que almanacena el monto ganado

//Setter and Getter Methods
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDePartido() {
        return numeroDePartido;
    }

    public void setNumeroDePartido(int numeroDePartido) {
        this.numeroDePartido = numeroDePartido;
    }

    public double getMontoEquipo1() {
        return montoEquipo1;
    }

    public void setMontoEquipo1(double montoEquipo1) {
        this.montoEquipo1 = montoEquipo1;
    }

    public double getMontoEmpate() {
        return montoEmpate;
    }

    public void setMontoEmpate(double montoEmpate) {
        this.montoEmpate = montoEmpate;
    }

    public double getMontoEquipo2() {
        return montoEquipo2;
    }

    public void setMontoEquipo2(double montoEquipo2) {
        this.montoEquipo2 = montoEquipo2;
    }
// Metodo para calculo de ganancia

    public void calcularGanancia(DatosPartido Partido)
    {
        ganancia = Partido.getFactorEmpate()*montoEmpate+Partido.getFactorEquipo1()*montoEquipo1+Partido.getFactorEquipo2()*montoEquipo2;
    }

}
