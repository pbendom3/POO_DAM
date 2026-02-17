package carrefour;

import java.util.ArrayList;

public class EmpleadosApp {

    public static void main(String[] args) {

        Cajero jorge = new Cajero(147,"Jorge",1800);

        jorge.mostrarInfo();

        Reponedor joaquin= new Reponedor(167,"Joaquin", 1801,"1A");

        joaquin.mostrarInfo();

        Seguridad carlos= new Seguridad(123, "Carlos", 900, "FaliyoCorp");

        carlos.crearArmas("porra");
        carlos.crearArmas("yorch");

        carlos.mostrarInfo();

        Persona manuel = new Cajero(1232,"Manuel",2000);
        Cajero manuel2 = new Cajero(manuel.getCodigo(),manuel.getNombre(), manuel.getSueldo());

        ArrayList<Persona> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(manuel);
        listaEmpleados.add(carlos);

        for (Persona persona : listaEmpleados){


        }

        fichar(manuel);
        fichar(carlos);

        jorge.trabajar();
        joaquin.trabajar();
        carlos.trabajar();

    }

    public static void fichar(Persona persona){

        System.out.println("Fichando...");
    }
}
