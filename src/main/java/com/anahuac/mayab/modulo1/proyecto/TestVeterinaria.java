package com.anahuac.mayab.modulo1.proyecto;

public class TestVeterinaria {

    public static void main(String[] args) {

        // Perro 1
        Perro perro1 = new Perro("Pastor", "firulais", "Areli Vega");
        CartillaPerro cartilla1 = new CartillaPerro(perro1, "123");
        Veterinaria vet = new Veterinaria("Mi veterinaria");
        vet.agregarPaciente(cartilla1);

        try {
            // Servicio para perro1
            Servicio servicio1 = vet.crearServicio("vacunas", perro1.getNombre(), "16-10-2024");
            servicio1.realizar(perro1.getNombre());
            // Agregar vacuna a perro1
            cartilla1.actualizar("vacuna", "16-10-2024");

            // Imprimir cartilla de perro1
            cartilla1.imprimirCartilla();
            // Imprimir expediente de perro1 en un archivo
            cartilla1.imprimirExpediente();

        } catch (Exception e) {
            System.out.println("Este servicio no lo ofrecemos");
            e.printStackTrace();
        }

        // Perro 2
        Perro perro2 = new Perro("Bulldog", "maximo", "Carlos Pérez");
        CartillaPerro cartilla2 = new CartillaPerro(perro2, "124");
        vet.agregarPaciente(cartilla2);

        try {
            // Servicio para perro2
            Servicio servicio2 = vet.crearServicio("vacunas", perro2.getNombre(), "17-10-2024");
            servicio2.realizar(perro2.getNombre());
            // Agregar vacuna a perro2
            cartilla2.actualizar("vacuna", "17-10-2024");

            // Imprimir cartilla de perro2
            cartilla2.imprimirCartilla();
            // Imprimir expediente de perro2 en un archivo
            cartilla2.imprimirExpediente();

        } catch (Exception e) {
            System.out.println("Este servicio no lo ofrecemos");
            e.printStackTrace();
        }

        // Perro 3
        Perro perro3 = new Perro("Labrador", "rex", "Juan López");
        CartillaPerro cartilla3 = new CartillaPerro(perro3, "125");
        vet.agregarPaciente(cartilla3);

        try {
            // Servicio para perro3
            Servicio servicio3 = vet.crearServicio("vacunas", perro3.getNombre(), "18-10-2024");
            servicio3.realizar(perro3.getNombre());
            // Agregar vacuna a perro3
            cartilla3.actualizar("vacuna", "18-10-2024");

            // Imprimir cartilla de perro3
            cartilla3.imprimirCartilla();
            // Imprimir expediente de perro3 en un archivo
            cartilla3.imprimirExpediente();

        } catch (Exception e) {
            System.out.println("Este servicio no lo ofrecemos");
            e.printStackTrace();
        }

        vet.imprimirExpediente();
    }
}

