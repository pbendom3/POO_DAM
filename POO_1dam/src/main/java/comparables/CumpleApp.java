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

        TreeMap<Invitado,String> mapa = new TreeMap<>(Collections.reverseOrder());







    }
}
