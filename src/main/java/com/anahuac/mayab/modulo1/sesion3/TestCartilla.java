package com.anahuac.mayab.modulo1.sesion3;

import java.io.IOException;

public class TestCartilla {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Perro miPerro = new Perro ("Unica", "Firulais", 5 , "Paty");
		CartillaPerro cartilla = new CartillaPerro();
		
		cartilla.setDatosPerro(miPerro);
		
		cartilla.actualizar("rabia", "5-03-2025");
		cartilla.actualizar("quintuple", "5-03-2025");
		cartilla.actualizar("bordetela", "5-03-2025");
		cartilla.actualizar("desparacitacion", "5-03-2025");
		cartilla.actualizar("puppy", "5-03-2025");
		cartilla.actualizar("pulgas", "5-03-2025");
		
		cartilla.imprimirCartilla();
		cartilla.imprimirExpediente();

	}

}
