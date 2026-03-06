package colecciones;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio_1_Set {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe una frase : ");
        String frase = read.nextLine();

        String[] frase_separada = frase.toLowerCase().split(" ");

        HashSet<String> set = new HashSet<>(Arrays.asList(frase_separada));

        System.out.println("Palabras únicas : " + set);

    }

}
