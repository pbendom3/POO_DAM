package mapas;

import java.util.*;

public class Ejercicio3 {

    static HashMap<String,Double> mapa = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("**** REGISTRO DE TEMPERATURAS ****");

        while(true){

            System.out.println("Elige una opción [insertar, actualizar, consultar, ver todas, salir]: ");

            String opcion = teclado.nextLine().toLowerCase();

            switch(opcion){
                case "insertar":
                    insertar();
                    break;
                case "actualizar":
                    actualizar();
                    break;
                case "consultar":
                    consultar();
                    break;
                case "ver todas":
                    verTodas();
                    break;
                case "salir": return;
                default:
                    System.out.println("No existe la opción. Vuelve a elegir una...");

            }

            System.out.println("***mapita temporal***");
            for (Map.Entry<String,Double> mapita : mapa.entrySet()){
                System.out.println(mapita.getKey() + " - " + mapita.getValue());
            }

        }


    }

    public static void insertar(){

        System.out.println("Introduce los datos (ciudad-temperatura): ");
        String ciudad[] = teclado.nextLine().split("/");
        //San Juan_-15

        mapa.put(ciudad[0],Double.valueOf(ciudad[1]));

    }

    public static void actualizar(){



    }

    public static void consultar(){



    }

    public static void verTodas(){



    }

}
