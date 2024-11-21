package com.anahuac.mayab.modulo1.proyecto;

public class ServicioMedico extends Servicio {

	public ServicioMedico(String tipo, double costo, String fecha, String encargado) {
		super(tipo, costo, fecha, encargado);
		// TODO Auto-generated constructor stub
	}
public void consultar(String nombre) {
	System.out.println("Realizar consulta del paciente :" + nombre);
}

public void darReceta() {
	System.out.println("Crear receta con recomendaciones: ");
}
	
public void realizar(String nombre) {
    if (getcartilla() != null) {
        getcartilla().actualizar(getTipo(), getFecha());
        System.out.println("Vacuna registrada: " + getTipo() + " en la fecha: " + getFecha());
    } else {
        System.out.println("No hay cartilla asignada para este servicio.");
    }
}
}
