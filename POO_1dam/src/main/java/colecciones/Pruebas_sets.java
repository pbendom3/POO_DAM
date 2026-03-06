package colecciones;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Pruebas_sets {

    public static void main(String[] args) {

        String esquiroles[] = {"Joaquín","Christian","Christian","Carlos","Carlos","Ángel","Kevin","Eric","DavidG","DavidG"};

        HashSet<String> normal = new HashSet<>(Arrays.asList(esquiroles));
        LinkedHashSet<String> respeta_add = new LinkedHashSet<>(Arrays.asList(esquiroles));
        TreeSet<String> ordenada = new TreeSet<>(Arrays.asList(esquiroles));

        System.out.println(normal);
        System.out.println(respeta_add);
        System.out.println(ordenada);

//        normal.








    }
}
