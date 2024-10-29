package com.anahuac.mayab.modulo1;

/**
 * Comparar dos numeros!
 */
public class Condicional  {
	
    public static void main(String[] args) {
    	int num1 = 20;
    	int num2 = 20;
    	
    	int Mayor = Math.max(num1, num2);    	   	
        System.out.println("El mayor es: "+ Mayor);
        
        if (num1 > num2) {
        	System.out.print("El mayor es:" + num1);
        }else if (num1<num2) {
        	System.out.print("El mayor es:" + num2);	
        }else {
        	System.out.print("Ambos numeros son iguales");
        }
        /**      
        if (num1 == num2) {
        	System.out.print("Ambos numeros son iguales");
        }else {
        	int Mayor1 = Math.max(num1, num2);
        	System.out.print("El mayor es" +Mayor1);
        }*/
    }
}

