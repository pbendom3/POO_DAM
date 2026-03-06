package colecciones;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio_3_Set {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        String palabra = "";

        LinkedHashSet<String> set = new LinkedHashSet<>();

        while (!palabra.toLowerCase().equals("salir") ){

            System.out.println("Escribe una URL visitada (o 'salir' para terminar): ");
            palabra = read.next();

            if (palabra.equals("salir")){

                break;

            }else {

                set.add(palabra);

            }

        }

        System.out.println("Historial de navegación : ");

        int contador = 1;

        for (String direccion : set){

            System.out.println(contador + ". " + direccion);
            contador++;
        }

    }

}
