package com.anahuac.mayab.modulo1.sesion5;

public class TestGasto {
	
	public static void imprimirFacturas(Facturable gasto, String id, String email) {
		gasto.pedirConstanciaSAT();
		gasto.emitirFactura(id);
		gasto.emitirFactura(email);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gasto gasto1 = new  GastoFacturable(500.0,"Comida", "16-10-2024", "tarjeta");
		Gasto gasto2 = new GastoFacturable(200.0,"Comida", "5-10-2024", "tarjeta");
		
		imprimirFacturas((Facturable)gasto2, "123","correo@dfr.com");
	}

}
