package com.co.sofka.evaluacion.seriesyvideogames;

public class Series implements Entregable {
    String titulo;
    int numeroTemporadas;
    boolean entregado;
    String genero;
    String creador;
    final int numeroTemporadasDefault = 3;
    final boolean entregadoDefault = false;

    public Series() {
    }

    public Series(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Series(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Series{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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

        if (this.numeroTemporadas == getNumeroTemporadas()) {
            System.out.println("Tienen el mismo numero de temporadas " + numeroTemporadas);
        } else {
            System.out.println("Tienen distinto numero de temporadas " + numeroTemporadas + " " + getNumeroTemporadas());
        }
    }
}
