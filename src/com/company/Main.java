package com.company;

import java.util.Scanner;

public class Main
{
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        // Declaracion de variables
        double [] cali = new double[5];
        double cont = 0;
        String nombre;

        //Se inserta el nombre
        System.out.println("Ingrese nombre del Alumno: ");
        nombre = teclado.nextLine();

        //Se ingresan las calificacónes
        System.out.println("Ingrese las calificaciónes: ");
        for (int x = 0; x < 5; x++) {
            cali[x] = teclado.nextDouble();
            cont =+ cali[x];
        }

        //Se
        Alumno al = new Alumno();
        al.Nombre(nombre, cali);
        al.calif(cont);
        al.Calificaciones(al.calif(cont));
        al.print(al.Nombre(nombre,cali), al.calif(cont), al.Calificaciones(al.cont));
    }
}
