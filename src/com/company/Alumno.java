package com.company;

import java.util.Scanner;

public class Alumno {

    //Se declara la función donde se ingresan los valores
    static Scanner teclado = new Scanner(System.in);

    //Declaración de varubales
    private String nombre;
    private double[] cali = new double[5];
    public double cont;
    private double promf;
    private double cont2;
    private char letra;

    //Inicialización de las variables
    public Alumno() {
        promf  = 0;
        cont2  = 0;
        cont   = 0;
        nombre = null;
        letra  = 0;
    }
    //Método que guarda el valor del nombre y el valor del arreglo de calificaciónes
    public String Nombre(String nombre, double[] cali) {
        this.nombre = nombre;
        this.cali = cali;

        return nombre;
    }
    //Metodo que realiza las matematicas para sacar el Promedio
    public double calif(double cont)
    {
        return cont/cali.length;
    }

    //Método que retorna la letra de la calificacón
    public char Calificaciones(double promf) {
        this.promf = promf;

        if(promf <= 50){
            letra = 'F';
        }
        if( promf <=60){
            letra = 'E';
        }
        if(promf <= 70){
            letra = 'D';
        }
        if(promf <= 80){
            letra = 'C';
        }
        if(promf <= 90){
            letra = 'B';
        }
        if(promf <= 100){
            letra = 'A';
        }
        return letra;
    }
    //Método que imprime el resultado
    public void print(String nombre, double promf, char letra)
    {
        System.out.println("Nombre: " + nombre);
        for(int d = 0; d < 5; d++){
            System.out.println("Calificación " + (d+1) + ": " + cali[d]);
        }
        System.out.println("Promedio Final: " + promf);
        System.out.println("Calificación: " + letra);
    }
}
