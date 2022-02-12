package com.co.sofka.evaluacion.electrodomesticos;

public class Lavadora extends Electrodomestico {

    int carga;
    final int cargaDefecto=5;

    public Lavadora() {
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double precioFinal(){
        double precioFinalLavadora;
        precioFinalLavadora=precioFinal(consumoEnergetico,peso);
        if (carga>30){
            precioFinalLavadora=precioFinalLavadora+50;
        }
        return precioFinalLavadora;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", pesoBase=" + pesoBase +
                ", carga=" + carga +
                '}';
    }
}
