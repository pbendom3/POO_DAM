package comparables;

import java.util.*;

public class CumpleApp {

    public static void main(String[] args) {

        List<Invitado> invitados = new ArrayList<>();
        invitados.add(new Invitado(15,"Jacobo"));
        invitados.add(new Invitado(12,"David"));
        invitados.add(new Invitado(12,"Dionisio"));

        Collections.sort(invitados, new OrdenarPorEdadNombreHora().reversed());

        System.out.println(invitados);

        TreeMap<Invitado,String> mapaInvitados = new TreeMap<>();

        mapaInvitados.put(new Invitado(15,"Jacobo"),"Raqueta");
        mapaInvitados.put(new Invitado(12,"David"),"500€");
        mapaInvitados.put(new Invitado(12,"Joaquín"),"Charla con Milei");

        List<Map.Entry<Invitado,String>> listaMapa = new ArrayList<>(mapaInvitados.entrySet());

        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Invitado,String> mapita : listaMapa){
            System.out.println(mapita.getKey().getNombre() + " " + mapita.getValue());
        }

    }
}
