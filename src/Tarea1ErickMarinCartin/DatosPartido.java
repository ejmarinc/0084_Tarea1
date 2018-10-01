package Tarea1ErickMarinCartin;

public class DatosPartido {

    private int numeroDePartido; // Atributos Partido
    private String fechaPartido;
    private String horaPartido;
    private float factorEmpate;
    private int codigoEquipo1; // Atributos Equipo 1
    private String nombreEquipo1;
    private float factorEquipo1;
    public int golesEquipo1;
    private int codigoEquipo2; // Atributos Equipo 2
    private String nombreEquipo2;
    private float factorEquipo2;
    private int golesEquipo2 ;
//    Estas variables son requeridas para otras funciones
    private int numeroDeApuestas = 0;

// Setter and Getter Methods

    public int getNumeroDeApuestas() {
        return numeroDeApuestas;
    }

    public void setNumeroDeApuestas(int numeroDeApuestas) {
        this.numeroDeApuestas = numeroDeApuestas;
    }

    public int getNumeroDePartido() {
        return numeroDePartido;
    }

    public void setNumeroDePartido(int numeroDePartido) {
        this.numeroDePartido = numeroDePartido;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getHoraPartido() {
        return horaPartido;
    }

    public void setHoraPartido(String horaPartido) {
        this.horaPartido = horaPartido;
    }

    public float getFactorEmpate() {
        return factorEmpate;
    }

    public void setFactorEmpate(float factorEmpate) {
        this.factorEmpate = factorEmpate;
    }

    public int getCodigoEquipo1() {
        return codigoEquipo1;
    }

    public void setCodigoEquipo1(int codigoEquipo1) {
        this.codigoEquipo1 = codigoEquipo1;
    }

    public String getNombreEquipo1() {
        return nombreEquipo1;
    }

    public void setNombreEquipo1(String nombreEquipo1) {
        this.nombreEquipo1 = nombreEquipo1;
    }

    public float getFactorEquipo1() {
        return factorEquipo1;
    }

    public void setFactorEquipo1(float factorEquipo1) {
        this.factorEquipo1 = factorEquipo1;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getCodigoEquipo2() {
        return codigoEquipo2;
    }

    public void setCodigoEquipo2(int codigoEquipo2) {
        this.codigoEquipo2 = codigoEquipo2;
    }

    public String getNombreEquipo2() {
        return nombreEquipo2;
    }

    public void setNombreEquipo2(String nombreEquipo2) {
        this.nombreEquipo2 = nombreEquipo2;
    }

    public float getFactorEquipo2() {
        return factorEquipo2;
    }

    public void setFactorEquipo2(float factorEquipo2) {
        this.factorEquipo2 = factorEquipo2;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }


}

