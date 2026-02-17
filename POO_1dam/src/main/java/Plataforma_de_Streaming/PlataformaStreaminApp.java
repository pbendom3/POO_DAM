package Plataforma_de_Streaming;

import java.util.ArrayList;

public class PlataformaStreaminApp {

    public static void main(String[] args) {

        ArrayList<Suscripcion> listaPlanes = new ArrayList<>();

        Suscripcion gratuito = new PlanGratis("Gratis", 0);
        Suscripcion basico = new PlanBasico("Básico", 9.99);
        Suscripcion premium = new PlanPremium("Premium", 14.99);

        listaPlanes.add(gratuito);
        listaPlanes.add(basico);
        listaPlanes.add(premium);

        for (Suscripcion suscripcion : listaPlanes){
            suscripcion.mostrarInfo();
            suscripcion.obtenerBeneficios();
        }
    }
}
