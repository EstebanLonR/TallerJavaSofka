package com.co.sofka.evaluacion.personas;

import javax.swing.*;
import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(double peso, double altura) {
        double imc;
        int resultado = 0;
        imc = (peso / altura * 2);
        if (imc < 20) {
            System.out.println("Tienes bajo peso, IMC de: " + imc);
            resultado = 1;

        }
        if (imc >= 20 && imc <= 25) {
            System.out.println("Tienes un peso normal, IMC de: " + imc);
            resultado = 0;
        }
        if (imc > 25) {
            System.out.println("Tienes sobrepeso, IMC de: " + imc);
            resultado = 1;
        }
        return resultado;
    }

    public boolean esMayorDeEdad(int edad) {
        boolean comprobar;
        if (edad >= 18) {
            System.out.println("Es Mayor de Edad");
            comprobar = true;
        } else {
            System.out.println("Es menor de Edad");
            comprobar = false;
        }
        return comprobar;
    }

    public char comprobarSexo(char sexo) {

        if (sexo != 'H' && sexo != 'M') {
            JOptionPane.showMessageDialog(null, "Genero incorrecto, Se te asignara el sexo Maculino (H)");
            sexo = 'H';
        }
        return sexo;
    }

    public  int generarDNI() {
        int dni;
        Random aleatorio = new Random();
        dni = aleatorio.nextInt(10000000, 99999999);
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{\n" +
                "nombre='" + nombre + "\n" +
                "edad=" + edad + "\n" +
                "dni=" + dni + "\n" +
                "sexo=" + sexo + "\n" +
                "peso=" + peso + "\n" +
                "altura=" + altura +
                '}';
    }
}
