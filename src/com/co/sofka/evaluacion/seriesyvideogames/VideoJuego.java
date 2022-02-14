package com.co.sofka.evaluacion.seriesyvideogames;

public class VideoJuego implements Entregable {
    String titulo;
    int horasEstimadas;
    boolean entregado;
    String genero;
    String compania;
    final int horasEstimadasDefault = 10;
    final boolean entregadoDefault = false;

    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        if (entregado == false) {
            entregado = true;
        }
    }

    @Override
    public void devolver() {
        if (entregado == true) {
            entregado = false;
        }
    }

    @Override
    public boolean isEntregado() {
        if (entregado == false) {
            System.out.println("Entregado");
        } else {
            System.out.println("Devuelto");

        }
        return false;
    }

    @Override
    public void compareTo(Object o) {

    }
}
