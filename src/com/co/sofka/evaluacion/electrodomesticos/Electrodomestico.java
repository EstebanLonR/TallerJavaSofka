package com.co.sofka.evaluacion.electrodomesticos;

public class Electrodomestico {

    double precio;
    final String colorDefecto = "Blanco";
    String color;
    final char consumoEnergeticoDefecto = 'F';
    char consumoEnergetico;
    int peso;
    final int pesoBase = 5;
    final int precioBaseDefecto = 100;

    public Electrodomestico() {
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precio = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precio = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public char comprobarConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico != 'A' && consumoEnergetico != 'B' && consumoEnergetico != 'C' && consumoEnergetico != 'D' && consumoEnergetico != 'E' && consumoEnergetico != 'F')
            consumoEnergetico = consumoEnergeticoDefecto;
        return consumoEnergetico;
    }

    public String comprobarColor(String color) {
        if (color.toLowerCase() != "blanco" && color.toLowerCase() != "negro" && color.toLowerCase() != "rojo" && color.toLowerCase() != "azul" && color.toLowerCase() != "gris")
            color = colorDefecto;
        return color;
    }

    public double precioFinal(char consumoEnergetico, double peso) {
        double precioConsumo = 0;
        double precioPeso = 0;
        if (consumoEnergetico == 'A') {
            precioConsumo = 100;
        }
        if (consumoEnergetico == 'B') {
            precioConsumo = 80;
        }
        if (consumoEnergetico == 'C') {
            precioConsumo = 60;
        }
        if (consumoEnergetico == 'D') {
            precioConsumo = 50;
        }
        if (consumoEnergetico == 'E') {
            precioConsumo = 30;
        }
        if (consumoEnergetico == 'F') {
            precioConsumo = 10;
        }
        if (peso == 0 && peso <= 19) {
            precioPeso = 10;
        }
        if (peso >= 20 && peso <= 49) {
            precioPeso = 50;
        }
        if (peso >= 50 && peso <= 79) {
            precioPeso = 80;
        }
        if (peso > 80) {
            precioPeso = 100;
        }
        precio = precioConsumo + precioPeso;
        return precio;
    }

}

