package com.co.sofka.evaluacion.personas;

import javax.swing.*;
import java.util.Random;

public class Ejecutable {

    public static int generarDNI() {
        int dni;
        Random aleatorio = new Random();
        dni = aleatorio.nextInt(10000000, 99999999);
        return dni;
    }

    public static void main(String[] args) {
        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;
        double imc;
        boolean mayorDeEdad;
        nombre = JOptionPane.showInputDialog("Ingresa el nombre de la persona");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la persona"));
        sexo = (JOptionPane.showInputDialog("Ingrese el sexo").charAt(0));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en KG"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en Metros"));
        Persona persona1 = new Persona(nombre,edad,generarDNI(),sexo,peso,altura);
        mayorDeEdad=persona1.esMayorDeEdad(edad);
        imc=persona1.calcularIMC(peso,altura);
        sexo=persona1.comprobarSexo(sexo);





    }
}
