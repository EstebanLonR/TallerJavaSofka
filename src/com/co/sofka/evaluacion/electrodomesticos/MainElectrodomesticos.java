package com.co.sofka.evaluacion.electrodomesticos;

import java.util.ArrayList;

public class MainElectrodomesticos {
    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico();
        Lavadora listasLavadora[] = {new Lavadora(100, electrodomestico.comprobarColor("amarillo"), electrodomestico.comprobarConsumoEnergetico('B'), 50, 25),
                new Lavadora(electrodomestico.precioBaseDefecto, electrodomestico.comprobarColor("rojo"), electrodomestico.comprobarConsumoEnergetico('H'), 55, 25),
                new Lavadora(200, electrodomestico.comprobarColor("negro"), electrodomestico.comprobarConsumoEnergetico('C'), 40, 30),
                new Lavadora(100, electrodomestico.comprobarColor("gris"), electrodomestico.comprobarConsumoEnergetico('O'), 56, 36),
                new Lavadora(150, electrodomestico.comprobarColor("verde"), electrodomestico.comprobarConsumoEnergetico('D'), 51, 28)};

        Television listaTelevision[] = {
                new Television(electrodomestico.precioBaseDefecto, electrodomestico.comprobarColor("gris"), electrodomestico.comprobarConsumoEnergetico('D'), electrodomestico.pesoBase, 22, false),
                new Television(145, electrodomestico.comprobarColor("verde"), electrodomestico.comprobarConsumoEnergetico('C'), 15, 40, true),
                new Television(200, electrodomestico.comprobarColor("negro"), electrodomestico.comprobarConsumoEnergetico('B'), 30, 60, true),
                new Television(electrodomestico.precioBaseDefecto, electrodomestico.comprobarColor("blanco"), electrodomestico.comprobarConsumoEnergetico('A'), 30, 25, false),
                new Television(400, electrodomestico.comprobarColor("gris"), electrodomestico.comprobarConsumoEnergetico('X'), 32, 55, true)};

        ArrayList<Lavadora> lavadoras = new ArrayList<>();
        ArrayList<Television> televisions = new ArrayList<>();

        for (int i = 0; i < listasLavadora.length; i++) {
            lavadoras.add(listasLavadora[i]);
            televisions.add(listaTelevision[i]);
        }

        for (int i = 0; i < lavadoras.size(); i++) {
            System.out.println(lavadoras.get(i).toString() + " Precio Total " + lavadoras.get(i).precioFinal());

        }
        System.out.println("-----------------------------------------------");
        for (int i = 0; i <televisions.size() ; i++) {
            System.out.println(televisions.get(i).toString() + " Precio Total " + televisions.get(i).precioFinal());
        }
    }
}
