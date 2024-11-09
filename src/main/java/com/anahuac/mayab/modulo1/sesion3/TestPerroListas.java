package com.anahuac.mayab.modulo1.sesion3;
 import java.util.ArrayList;
import java.util.Random;
import java.util.Map.Entry;
public class TestPerroListas {
	
	public static void main(String[] args) {
		
		String[] nombres = {"perro1","perro2","perro3","perro4","perro5","perro6"};
		String[] duenos = {"Ana","Luis","Malena","luis 2", "Ariana"};
	ArrayList <Integer> num = new ArrayList<Integer>();
	
	for (int i=1; i<=10; i++) {
		System.out.println(i);
		num.add(i);
	}
	
	//Acceder a los elementos de un arrayList
	System.out.println("El elemento 0 en la lista "+ num.get(0));
	num.add(100);
	
	Random randomGenerator = new java.util.Random();
    
	ArrayList<Perro> ListaPerros = new ArrayList<Perro>();
	
	for (int i=0; i<10; i++) {
		Perro perroTemporal = new Perro ();
		perroTemporal.setNombre(nombres[i]);
		int numeroAleatorio = randomGenerator.nextInt(nombres.length);
		perroTemporal.setNombreDuenio(duenos[numeroAleatorio]);
		
		ListaPerros.add(perroTemporal);
	}
	
   }
}
