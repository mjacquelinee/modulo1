package com.anahuac.mayab.modulo1.sesion5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestArchivo {
	
	public static void main(String[] args) throws IOException {
		
		String nombreArchivo = "prueba.txt";
		try (FileWriter archivo = new FileWriter (nombreArchivo))
		{
			PrintWriter pw = new PrintWriter (archivo);
			pw.print("Hola, Bienvenido al diplomado de programacion");
			pw.print("\\ ten JAVA");
			pw.print("\\ n Esta es otra linea");
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
