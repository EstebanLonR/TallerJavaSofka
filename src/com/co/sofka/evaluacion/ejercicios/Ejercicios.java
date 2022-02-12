package com.co.sofka.evaluacion.ejercicios;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Vector;

public class Ejercicios {

    //Ejercicio 1
    public void mayorDeDosNumeros(int numero1, int numero2) {
        if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "El numero mayor fue el segundo valor ingresado (" + numero2 + " Mayor que " + numero1 + ")");
        } else {
            JOptionPane.showMessageDialog(null, "El numero mayor fue el primer valor ingresado (" + numero1 + " Mayor que " + numero2 + ")");
        }

    }

    //Ejercicio 2
    public void mayorDeDosNumerosSolicitandoDatos() {
        int numero1;
        int numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el segundo numero"));
        if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "El numero mayor fue el segundo valor ingresado (" + numero2 + " Mayor que " + numero1 + ")");
        } else {
            JOptionPane.showMessageDialog(null, "El numero mayor fue el primer valor ingresado (" + numero1 + " Mayor que " + numero2 + ")");
        }
    }

    //Ejercicio 3
    public void areaCirculo() {
        double radio;
        double areaCirculo;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Digita el valor del radio para el circulo"));
        areaCirculo = Math.pow(radio, 2) * Math.PI;
        JOptionPane.showMessageDialog(null, "El area del circulo es " + areaCirculo);
    }

    //Ejercicion 4
    public void calcularPrecioConIVA() {
        double precioProducto;
        precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el valor del producto"));
        final double iva = 0.21 * precioProducto;
        double totalPrecio = precioProducto + iva;
        JOptionPane.showMessageDialog(null, "El precio principal del producto sin iva fue de " + precioProducto + "\n" +
                "El IVA del 21% para este producto es de " + iva + " y el precio total del producto es de " + totalPrecio);
    }

    //Ejercicio 5
    public void numerosParesImparesWhile() {
        int contador = 0;
        Vector<Object> pares = new Vector<Object>();
        Vector<Object> impares = new Vector<Object>();
        while (contador <= 100) {
            contador++;
            if (contador % 2 == 0) {
                pares.add(contador);
            } else {
                impares.add(contador);
            }
        }

        System.out.println("Numeros Pares" + pares);
        System.out.println("Numeros Impares" + impares);
    }

    //Ejercicio 6
    public void numerosParesImparesFor() {
        Vector<Object> pares = new Vector<Object>();
        Vector<Object> impares = new Vector<Object>();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }
        }
        System.out.println("Numeros Pares" + pares);
        System.out.println("Numeros Impares" + impares);
    }

    //Ejercicio 7
    public void mayorIgualCero() {
        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero"));
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "Upsss...Tienes que colocar un numero mayor o igual a 0");
            }
        } while (numero < 0);

        JOptionPane.showMessageDialog(null, "El numero 'Mayor o Igual a 0' que digitaste fue: " + numero);
    }

    //Ejercicio 8
    public void diaLaboral() {
        int diaSemana;
        diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Por favor escoja un dia de la semana para corroborar si es un dia laboral o no\n" +
                "Recuerde que la semana contiene 7 dias, siendo Lunes el 1 y Domingo el 7\n" +
                "1.)Lunes\n" +
                "2.)Martes\n" +
                "3.)Miercoles\n" +
                "4.)Jueves\n" +
                "5.)Viernes\n" +
                "6.)Sabado\n" +
                "7.)Domingo\n" +
                "\n" +
                "8.)Salir del Proceso\n"));

        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes Dia laboral");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes Dia laboral");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles Dia laboral");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves Dia laboral");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Viernes Dia laboral");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sabado Dia laboral o no laboral(Dependiendo la compañia)");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo Dia de descanso");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Hasta la proxima :)");
                break;
        }
    }

    //Ejecicio 9
    public void reemplazarLetra() {
        String fraseReemplazoLetra = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseCooncatenar = "Oso Oso,eso es mentira..Se dice Oso Oso Mentiroso";
        String nuevaFrase = fraseReemplazoLetra.replace("a", "e");
        JOptionPane.showMessageDialog(null, nuevaFrase + " " + fraseCooncatenar);

    }

    //Ejercicio 10
    public void eliminarEspacios() {
        String frase;
        frase = JOptionPane.showInputDialog("Ingrese una frase");
        System.out.println(frase.replace(" ", ""));
    }

    //Ejercicio 11
    public void longitudVocalesFrase() {
        String frase;
        int contadorVocales = 0;
        int contador_a = 0;
        int contador_e = 0;
        int contador_i = 0;
        int contador_o = 0;
        int contador_u = 0;
        frase = JOptionPane.showInputDialog("Por favor ingrese una frase");
        String fraseRefractorizada = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (fraseRefractorizada.charAt(i) == 'a') {
                contador_a++;
            }
            if (fraseRefractorizada.charAt(i) == 'e') {
                contador_e++;
            }
            if (fraseRefractorizada.charAt(i) == 'i') {
                contador_i++;
            }
            if (fraseRefractorizada.charAt(i) == 'o') {
                contador_o++;
            }
            if (fraseRefractorizada.charAt(i) == 'u') {
                contador_u++;
            }
            contadorVocales = contador_a + contador_e + contador_i + contador_o + contador_u;
        }
        JOptionPane.showMessageDialog(null, "La longitud de la frase es de " + fraseRefractorizada.length() + " Caracteres\n" +
                "Vocales a: " + contador_a + "\n" +
                "Vocales e: " + contador_e + "\n" +
                "Vocales i: " + contador_i + "\n" +
                "Vocales o: " + contador_o + "\n" +
                "Vocales u: " + contador_u + "\n" +
                "Contador de Vocales en total en la frase: " + contadorVocales);
    }

    //Ejercicio 12
    public void compararPalabras() {
        String palabra1;
        String palabra2;
        palabra1 = JOptionPane.showInputDialog("Por favor ingrese la primera palabra");
        palabra2 = JOptionPane.showInputDialog("Por favor ingrese la segunda palabra");

        if (palabra1.equalsIgnoreCase(palabra2)) {
            JOptionPane.showMessageDialog(null, "Las palabras son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "Las palabras no son iguales\n" +
                    "Primera Palabra: " + palabra1 + "\n" +
                    "Segunda Palabra: " + palabra2);
        }
    }

    //Ejercicio 13
    public void fechaHoraActual() {
        LocalTime horaActual = LocalTime.now();
        LocalDate fechaActual = LocalDate.now();

        JOptionPane.showMessageDialog(null, "Buenos dias...Tardes...Noches\n" +
                "Depende a que horas veas esto \n" +
                "Son las: " + horaActual + "\n" +
                "Del dia: " + fechaActual);
        ;
    }

    //Ejercicio 14
    public void deDosEnDos() {
        int numeroInicial;
        numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero entero por el cual desee iniciar el conteo de dos en dos hasta 1000"));
        for (int i = numeroInicial; i <= 1000; i += 2) {
            System.out.println(i);
        }
    }

    //Ejercicio 15
    public void gestionCinematografica() {
        int opcion;
        String menu = "    ****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR";

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    continue;
                case 2:
                    continue;
                case 3:
                    continue;
                case 4:
                    continue;
                case 5:
                    continue;
                case 6:
                    continue;
                case 7:
                    continue;
                case 8:
                    JOptionPane.showMessageDialog(null, "Eso es tod..Eso es tod..Eso es todo Amigos :D");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
            }
        } while (opcion != 8);

    }



}
