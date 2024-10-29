package com.anahuac.mayab.modulo1;

import java.util.Scanner;

/**
 * Calcular el Area de un circulo!
 * 
 */

public class Circulo {
    public static void main(String[] args) {
    	//Solicitar el perimetro
        System.out.println("Ingrese el perimetro del circulo: ");
        Scanner scanner = new Scanner (System.in);
        double perimetro = scanner.nextDouble();
        
        //Calcular el area
        double radio = perimetro / (2*Math.PI);
        double area = Math.PI* radio*radio;
        
        //Mostrar el resultado
        System.out.print("El area del circulo es : " + area);
    }
}
