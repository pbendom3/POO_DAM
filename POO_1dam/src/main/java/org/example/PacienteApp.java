package org.example;

public class PacienteApp {
    public static void main(String[] args) {

        Paciente patri = new Paciente();

        System.out.println(patri.getDni());

        Paciente prueba = new Paciente("juan", 20,'H',1000,16);

        // VALIDAR H Y MMMMMM

        System.out.println(prueba.calcularIMC());





    }
}
