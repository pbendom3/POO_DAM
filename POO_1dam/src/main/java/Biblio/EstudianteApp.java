package Biblio;

public class EstudianteApp {

    public static void main(String[] args) {

        Estudiante jorge = new Estudiante("jorge","1DAM","jorge@iesmutxamel.com");

        System.out.println(jorge.getNia());

        Estudiante raul = new Estudiante("raul");

        System.out.println(raul.getNia());

        Estudiante adrian = new Estudiante("adrian");

        System.out.println("Hay " + Estudiante.obtenerTotalEstudiantes() + " estudiantes.");

        System.out.println(Estudiante.validarCorreo("patri@mutxamel.com"));
        System.out.println(Estudiante.validarCorreo("patri@alu.edu.gva.es"));

        Editorial millenium = new Editorial("Millenium","España");

        Libro divina_comedia = new Libro("divina comedia","dante ali",millenium);

        System.out.println(divina_comedia);

        Prestamo p1 = divina_comedia.prestar(jorge);

        System.out.println("Fecha préstamo: " + p1.getFecha());

        System.out.println(jorge);

        System.out.println(divina_comedia.estaDisponible());

        System.out.println(divina_comedia);

        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
        System.out.println("Libros creados: " + Libro.getTotalLibros());

        divina_comedia.devolver();
        divina_comedia.devolver();

        System.out.println(divina_comedia.estaDisponible());

        System.out.println(divina_comedia);








    }

}
