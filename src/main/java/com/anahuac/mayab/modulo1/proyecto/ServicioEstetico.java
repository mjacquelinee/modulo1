package com.anahuac.mayab.modulo1.proyecto;

public class ServicioEstetico  extends Servicio{

	public ServicioEstetico(String tipo, double costo, String fecha, String encargado) {
		super(tipo, costo, fecha, encargado);
		// TODO Auto-generated constructor stub
	}

	
	public void realizar(String nombre) {
		// TODO Auto-generated method stub
		System.out.print("Atendiendo a: " + nombre);
		baniar();
		cepillar();
		cortarUnias();
		
	}

	private void cortarUnias() {
		// TODO Auto-generated method stub
		System.out.println("Cortando unas...");
		
	}

	private void cepillar() {
		// TODO Auto-generated method stub
		System.out.println("Cepillando...");
		
	}

	private void baniar() {
		// TODO Auto-generated method stub
		System.out.println("Banando...");
		
	}

	

}
