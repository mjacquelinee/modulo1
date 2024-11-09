package com.anahuac.mayab.modulo1.sesion3;

public class TestPerro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro perro1 = new Perro();
		Perro perro2 = new Perro ("Simuerdiera","Criollo","Grande",15,"12","Pepe");
	
		perro1.setNombre("Solovino");
		System.out.println("El perro se llama"+ perro1.getNombre());
		System.out.println("El perro se llama");
		perro2.Ladrar();
		
	}

}
