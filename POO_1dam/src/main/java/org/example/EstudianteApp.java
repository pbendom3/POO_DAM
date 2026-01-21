package org.example;

public class EstudianteApp {

    public static void main(String[] args) {

        Estudiante jorge = new Estudiante("jorge","1DAM","jorge@iesmutxamel.com");

        System.out.println(jorge.getNia());
        System.out.println(jorge);

        Estudiante raul = new Estudiante("raul");

        System.out.println(raul.getNia());
        System.out.println(raul);

        Estudiante adrian = new Estudiante("adrian");

        System.out.println("Hay " + Estudiante.obtenerTotalEstudiantes() + " estudiantes.");

        System.out.println(Estudiante.validarCorreo("patri@mutxamel.com"));
        System.out.println(Estudiante.validarCorreo("patri@alu.edu.gva.es"));








    }

}
