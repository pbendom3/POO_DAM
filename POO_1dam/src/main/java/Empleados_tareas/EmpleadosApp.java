package Empleados_tareas;

import java.util.ArrayList;

public class EmpleadosApp {
    public static void asignarTarea(Empleados empleados){
        System.out.println("Asignando tarea al empleado...");
        empleados.realizarTarea();
    }
    public static void main(String[] args) {
        Desarrollador jacobo = new Desarrollador();
        Diseñador angel = new Diseñador();
        Gerente kevin = new Gerente();

        ArrayList<Empleados> listaempleados = new ArrayList<>();
        listaempleados.add(jacobo);
        listaempleados.add(angel);
        listaempleados.add(kevin);

        for (Empleados empleados:listaempleados){
            empleados.realizarTarea();
        }

        asignarTarea(jacobo);

        System.out.println("===Agregando tareas===");
        Empleados jorge = new Diseñador();
        Empleados raula = new Gerente();

        asignarTarea(jorge);
        asignarTarea(raula);
    }
}
