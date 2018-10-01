package Tarea1ErickMarinCartin;

import Tarea1ErickMarinCartin.DatosPartido;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.management.GarbageCollectorMXBean;

public class Apuesta{

    private String cedula;
    private String nombre;
    private int numeroDePartido;
    private double montoEquipo1 = 0;
    private double montoEmpate = 0;
    private double montoEquipo2 = 0;

    private double ganancia; // variable de instancia que almanacena el monto ganado
    private double montoApostado;
    private double montoGanado = 0;

    private int numeroDeApuesta;

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

    public int getNumeroDeApuesta() {
        return numeroDeApuesta;
    }

    public void setNumeroDeApuesta(int numeroDeApuesta) {
        this.numeroDeApuesta = numeroDeApuesta;
    }

    public double getGanancia() {
        return ganancia;
    }

    public double getMontoApostado() {
        return montoApostado;
    }

    public double getMontoGanado() {
        return montoGanado;
    }
    // Metodo para calculo de ganancia

    public void calcularGanancia(DatosPartido Partido)
    {
        montoApostado = montoEmpate + montoEquipo1 + montoEquipo2;
        if (Partido.getGolesEquipo1() > Partido.getGolesEquipo2()) {
            montoGanado = Partido.getFactorEquipo1()*montoEquipo1;
        }
        if (Partido.getGolesEquipo2() > Partido.getGolesEquipo1()) {
            montoGanado = Partido.getFactorEquipo2()*montoEquipo2;
        }
        if (Partido.getGolesEquipo2() == Partido.getGolesEquipo1()) {
            montoGanado = Partido.getFactorEmpate()*montoEmpate;
        }

        this.ganancia = this.montoGanado - this.montoApostado;
    }
//    Metodo para imprimir los datos de la apuesta se realiza en consola
    public void imprimirApuesta()
    {
        System.out.print("Número de Apuesta: ");
        System.out.println(numeroDeApuesta);
        System.out.print("Cédula: ");
        System.out.println(cedula);
        System.out.print("Nombre: ");
        System.out.println(nombre);
        System.out.print("Monto Apostado al Equipo 1: ");
        System.out.println(montoEquipo1);
        System.out.print("Monto Apostado al Equipo 2: ");
        System.out.println(montoEquipo2);
        System.out.print("Monto Apostado a Empate: ");
        System.out.println(montoEmpate);
        System.out.print("Monto Apostado : ");
        System.out.println(montoApostado);
        System.out.print("Monto Pagado : ");
        System.out.println(montoGanado);
        System.out.print("Ganancia : ");
        System.out.println(ganancia);


    }

}
