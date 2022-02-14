package com.co.sofka.evaluacion.seriesyvideogames;

import java.util.ArrayList;

public class EjecutableSeriesVideoJuegos {
    public static void main(String[] args) {

        VideoJuego videoJuego1 = new VideoJuego("Carlos duti", 12, "Accion", "Activision");
        VideoJuego videoJuego2 = new VideoJuego("Capcom vs SNK 2", 1, "Figthing", "CAPCOM-SNK");
        VideoJuego videoJuego3 = new VideoJuego("Malevolo Residente en 4", 12, "Accion-Horror", "CAPCOM");
        VideoJuego videoJuego4 = new VideoJuego("Sonico", 5, "Aventura", "SEGA");

        videoJuego1.entregar();
        videoJuego2.entregar();
        videoJuego3.devolver();
        videoJuego4.devolver();

        Series series1 = new Series("Bolas del Dragon Z", 4, "Shounen", "Akira Toriyama");
        Series series2 = new Series("Una Pieza", 100, "Shounen", "Un japones");
        Series series3 = new Series("El ninja de la Hoja",  2, "Shounen", "Masashi kishimoto");
        Series series4 = new Series("Maguaiber", 5, "Accion", "Un gringo");

        series1.entregar();
        series4.entregar();
        series4.devolver();
        series3.devolver();

        ArrayList<Series> listaSeries = new ArrayList<>();
        listaSeries.add(series1);
        listaSeries.add(series2);
        listaSeries.add(series3);
        ArrayList<VideoJuego> listaVideoJuego = new ArrayList<>();
        listaVideoJuego.add(videoJuego1);
        listaVideoJuego.add(videoJuego2);
        listaVideoJuego.add(videoJuego3);


        for (int i = 0; i < listaSeries.size(); i++) {
            System.out.println(listaSeries.get(i).toString()+listaSeries.get(i).isEntregado());

        }

        for (int i = 0; i <listaVideoJuego.size() ; i++) {
            System.out.println(listaVideoJuego.get(i).toString()+listaVideoJuego.get(i).isEntregado());
        }

    }

}
