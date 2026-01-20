package org.example;

public class PacienteApp {
    public static void main(String[] args) {

        Paciente patri = new Paciente();

        System.out.println(patri.getDni());

        Paciente prueba = new Paciente("juan", 20,'H',60,166);

        // VALIDAR H Y MMMMMM

        System.out.println(prueba.calcularIMC());

        System.out.println(patri.esMayorDeEdad());

        if (prueba.esMayorDeEdad()){
            System.out.println("Es mayor");
        }else{
            System.out.println("No es");
        }


        Paciente pepe = new Paciente("pepe", 80, 'G', 40, 160);

        System.out.println(pepe.getGenero());

        System.out.println(patri);

    }
}
