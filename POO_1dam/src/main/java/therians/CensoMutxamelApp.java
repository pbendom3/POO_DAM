package therians;

import java.util.ArrayList;

public class CensoMutxamelApp {

    public static ArrayList<Agente> agentesPoliciaRegistrados = new ArrayList<>();
    static ArrayList<Expediente> listaExpedientes = new ArrayList<>();

    static public void verExpedientes() {

    }

    public static void main(String[] args) {
        agentesPoliciaRegistrados.add(new Agente("Luisa","Mutxamel",2334));
        agentesPoliciaRegistrados.add(new Agente("Raúl","Mutxamel",1234));

        for (Agente agente : agentesPoliciaRegistrados) {
            System.out.println("Agente " + agente.getNombre() + " registrado. Tu ID es " + agente.getId());
        }

        Agente agente1 = new Agente("Jorge","Mutxamel",1245);

        Expediente expediente = agente1.crearExpediente();
        listaExpedientes.add(expediente);

        expediente.insertarSeres();

        agente1.siguienteEstado(expediente);

        expediente.verTasas();

    }
}
