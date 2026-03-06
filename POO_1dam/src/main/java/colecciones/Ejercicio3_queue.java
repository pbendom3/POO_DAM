package colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3_queue {
    public static void main(String[] args) {
        Queue<String> playlist = new LinkedList<>();

        playlist.offer("Let it be - The Beatles");
        playlist.offer("Bohemian Rapsody - Queen");
        playlist.offer("Shape of you - Ed Sheeran");
        playlist.offer("Diamantes - Rubius");
        playlist.offer("Diamantito2 - Mikecrack");

        System.out.println("Estado inicial de la playlist: "+playlist);
        while (!playlist.isEmpty()){
            System.out.println("Reproduciendo: "+playlist.poll());
            System.out.println("Estado de la playlist después de reproducir una canción: "+playlist);
        }
        System.out.println("La playlist ha terminado.");
    }
}
