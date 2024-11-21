package com.anahuac.mayab.modulo1.sesion5;

import java.util.ArrayList;

public class TestPatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pato pato1 = new PatoMallard("Mallard", "negro");
		Pato pato2 = new PatoHule("Hule","amarillo");
		Pato pato3 = new PatoSenuelo("senuelo","gris");
		
		ArrayList<Pato> ListaPatos = new ArrayList<Pato>();
		
		ListaPatos.add(pato1);
		ListaPatos.add(pato2);
		ListaPatos.add(pato3);
		
		ArrayList<Pato> simulador = new ArrayList<Pato>();
		simulador.simulaAcciones(ListaPatos);
		
		//for (Pato p: ListaPatos) {
		//	p.volar();
		//    p.quack();
		//}
		/*
		System.out.println("Nombre "+pato1.getNombre());
		System.out.println("Nombre "+pato2.getNombre());
		System.out.println("Nombre "+pato3.getNombre());
*/
		
		
	}

}
