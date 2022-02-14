package com.co.sofka.evaluacion.personas;

import javax.swing.*;


public class Ejecutable {


    public static void main(String[] args) {
        Persona personaMaster = new Persona();
        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;

       nombre = JOptionPane.showInputDialog("Ingresa el nombre de la persona");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la persona"));
        sexo = (JOptionPane.showInputDialog("Ingrese el sexo").charAt(0));
        sexo = personaMaster.comprobarSexo(sexo);
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en KG"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en Metros"));
        Persona persona1 = new Persona(nombre, edad, personaMaster.generarDNI(), sexo, peso, altura);
        persona1.esMayorDeEdad(edad);
        persona1.calcularIMC(peso, altura);

        Persona persona2 = new Persona();
        persona2.setNombre("Estefania");
        persona2.setEdad(40);
        persona2.setSexo('M');
        persona2.comprobarSexo(persona2.getSexo());
        persona2.setPeso(65);
        persona2.setAltura(1.65);
        persona2.calcularIMC(persona2.getPeso(),persona2.getAltura());
        persona2.esMayorDeEdad(persona2.getEdad());

        Persona persona3=new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.esMayorDeEdad(persona3.getEdad());
        persona3.generarDNI();
        persona3.setSexo(sexo);
        persona3.comprobarSexo(persona3.getSexo());
        persona3.setPeso(49);
        persona3.setAltura(1.80);
        persona3.calcularIMC(persona3.getPeso(),persona3.getAltura());





        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());



    }
}
