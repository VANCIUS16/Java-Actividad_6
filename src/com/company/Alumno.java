package com.company;

import java.util.Scanner;

public class Alumno {
    static Scanner teclado = new Scanner(System.in);

    public String nombre;
    public double[] cali = new double[5];
    public double prom;
    public double cont;
    public double promf;
    public double cont2;
    public char letra;

    public Alumno() {
        cont = 0;
        prom = 0;
        promf = 0;
        cont2 = 0;
        nombre = null;
        letra = 0;
    }
    public String Nombre(String nombre, double[] cali) {
        this.nombre = nombre;
        this.cali = cali;

        return nombre;
    }
    public double calif(double cont)
    {
        return cont/cali.length;
    }
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
