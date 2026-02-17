package dispositivos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DispositivosApp {

    public static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        Televisor samsung = new Televisor("Samsung");
        Parlante alexa = new Parlante("Alexa");

        listaDispositivos.add(samsung);
        listaDispositivos.add(alexa);

//        Encender cada dispositivo.
//        Sincronizar en caso de que un dispositivo implemente ControlRemoto.
//        Mostrar el estado de cada dispositivo.
//        Apagar cada dispositivo.

        Dispositivo proyector = new Dispositivo("Optoma borroso") {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El proyector ya está encendido.");
                }else{
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    estado=true;
                }
            }
        };

        proyector.encender();
        proyector.encender();

        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        proyector_sinc.sincronizar();

        Dispositivo horno_ia = new Dispositivo("Horno LG") {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("El horno ya está encendido.");
                }else{
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    estado=true;
                }

            }
        };

        horno_ia.encender();

        listaDispositivos.add(proyector);
        listaDispositivos.add(horno_ia);

        for(Dispositivo dispositivo : listaDispositivos){
            dispositivo.encender();
            dispositivo.encender();
            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.nombre.equals("Optoma borroso")) {
                proyector_sinc.sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.apagar();
        }




    }
}
