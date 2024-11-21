package com.anahuac.mayab.modulo1.proyecto;

import java.io.IOException;
import java.util.ArrayList;

public class Veterinaria {
	
	private String nombre;
	private ArrayList<CartillaPerro>ListaPacientes = new ArrayList<CartillaPerro>();
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Veterinaria(String nombre) {
		super ();
		this.nombre =nombre;
	}

	public Servicio crearServicio(String tipo, String nombre, String fecha) throws Exception {
		Servicio servicio = null;
		
		if (tipo.equals("bano") || tipo.equals("corte")) {
		    servicio = new ServicioEstetico(tipo, 250, fecha, "Juan Perez");
		} else if (tipo.startsWith("vacuna") || tipo.equals("consulta")) {
		    servicio = new ServicioEstetico(tipo, 250, fecha, "Alfredo Loya");
		}
		else {
			throw new Exception ("No existe ese servicio");
		}
		return servicio;
	}
	
	public void agregarPaciente(CartillaPerro cartilla) {
		
		ListaPacientes.add(cartilla);
	}
	
	public void imprimirExpediente() {
		for(CartillaPerro c : ListaPacientes) {
		try {
			c.imprimirExpediente();
		} catch (IOException e) {
			System.out.println("No pude generar el expediente");
			e.printStackTrace();
			
		}	
		
		}
	}
	

}
