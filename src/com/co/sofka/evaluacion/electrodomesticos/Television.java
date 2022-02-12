package com.co.sofka.evaluacion.electrodomesticos;

public class Television extends Electrodomestico {

    int resolucion;
    boolean sintonizadorTDT = false;

    public Television() {
    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double precioFinal() {
        double precioFinalTelevision;
        precioFinalTelevision = precioFinal(consumoEnergetico, peso);
        if (resolucion > 40) {
            precioFinalTelevision = (precioFinalTelevision * 0.3) + precioFinalTelevision;
        }
        if (sintonizadorTDT == true) {
            precioFinalTelevision = precioFinalTelevision + 50;
        }
        return precioFinalTelevision;
    }

    @Override
    public String toString() {
        return "Television{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", pesoBase=" + pesoBase +
                ", resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                '}';
    }
}
