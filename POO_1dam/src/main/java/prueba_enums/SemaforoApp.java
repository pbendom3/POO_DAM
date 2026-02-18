package prueba_enums;

public class SemaforoApp {

    public static void main(String[] args) {

        Semaforo actual = Semaforo.ROJO;

        for (int i = 0; i < 10; i++) {

            System.out.println(actual.name());

            actual = actual.siguiente();

        }


    }

}
