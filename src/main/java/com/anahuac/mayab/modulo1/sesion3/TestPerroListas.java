package com.anahuac.mayab.modulo1.sesion3;
 import java.util.ArrayList;
import java.util.HashMap;
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
	 for (int i =0; i<10; i++) {
		 ListaPerros.get(i).ladrar();
	 }
	 
	 //Busqueda de un perro
	 for (int i=0; i<ListaPerros.size(); i++) {
		 String nombre = ListaPerros.get(i).getNombre();
		 if (nombre == "perro6") {
			 ListaPerros.get(i).setNombre("Nuevo nombre del perro");
			 break;
		 }
	 }
	 
	 System.out.println("----Despues de cambiar el nombre");
	 
	 for (int i=0; i<10; i++){
		 ListaPerros.get(i).ladrar(); 
	 }
	System.out.println("____For each");
	for(Perro perro:ListaPerros) {
		perro.ladrar();
	}
	System.out.println("____Usando Un HasMap");
	HashMap<Integer, Perro> mapPerros = new HashMap<>();
	
	for (int i=0; i < 10; i++) {
		Perro perroTemporal = new Perro ();
		perroTemporal.setNombre(nombres[i]);
		int numeroAleatorio = randomGenerator.nextInt(nombres.length);
		perroTemporal.setNombreDuenio(duenos[numeroAleatorio]);
		
		//Ya que estan sentados los valores, ahora guardo en el map
		mapPerros.put(i, perroTemporal);
	}
	System.out.println("----Usando un hasMap con keyset");
	for(Integer i: mapPerros.keySet()) {
		mapPerros.get(i).ladrar();
	}
	System.out.println("---Usando un hasMap con entryset--");
	for (Entry <Integer,Perro>entry:mapPerros.entrySet()){
		entry.getValue().ladrar();
	}	
	System.out.println("---------Usando un hasMap con Values");
	for (Perro p:mapPerros.values()) {
		p.ladrar();
	}
   }
}
