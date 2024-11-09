package com.anahuac.mayab.modulo1.sesion3;

public class Perro {
	//Atributos de la clase
	private String nombre;
	private String raza;
	private String tamanio;
	private int edad;
	private double peso;
	private String nombreDuenio;
	
	public Perro() {}
	public Perro(String string, String string2, String string3, int i, String string4, String string5) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.tamanio = tamanio;
		this.edad = edad;
		this.peso = peso;
		this.nombreDuenio = nombreDuenio;
	}
	
	
	//Metodos getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNombreDuenio() {
		return nombreDuenio;
	}
	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}
	
	public void Ladrar() {
		System.out.println("Estoy Ladrando");
	}

}
