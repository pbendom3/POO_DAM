package iteradores;

import java.util.*;

public class Iteradores {

    public static void main(String[] args) {

        TreeSet<String> lista = new TreeSet<>();
        lista.add("Pikachu");
        lista.add("Charmander");
        lista.add("Squirtle");
        lista.add("Bulbasur");
        lista.add("Magikarp");

//        for (String pokemon : lista){
//            if (pokemon.equals("Pikachu")){
//                lista.remove(pokemon);
//            }
//        }

        Iterator<String> it = lista.iterator();

      //  lista.remove("Bulbasur");

        while(it.hasNext()){

            String pokemon = it.next();

            if (pokemon.equals("Pikachu")){
                it.remove();
            }

            System.out.println(pokemon);

        }

        System.out.println(lista);

        HashMap<String,Integer> mapa = new HashMap<>();

        mapa.put("Nicki Nickole",4);
        mapa.put("Hermione",7);

        Iterator<Map.Entry<String,Integer>> itmapita = mapa.entrySet().iterator();

        System.out.println(mapa.entrySet());

        while(itmapita.hasNext()){
            Map.Entry<String,Integer> novia = itmapita.next();
            System.out.println(novia.getKey() + " ha durado " + novia.getValue() + " meses con Joaquín");

            if (novia.getKey().equals("Hermione")){
                itmapita.remove();
            }

        }












    }
}
