package reservas;

import java.util.*;

public class ReservasApp {
    static HashMap<Usuario, HashSet<Reserva>> mapa = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void eliminar(HashSet<Reserva> listaReserva){
        System.out.print("Que tipo de pista quieres eliminar: ");
        String pista = teclado.next().toLowerCase();
        Iterator<Reserva> it = listaReserva.iterator();
        while (it.hasNext()){
          Reserva reserva = it.next();
          if (reserva.getPista() instanceof Tenis && pista.equals("tenis")){
              it.remove();
          }else if (reserva.getPista() instanceof Padel && pista.equals("padel")){
              it.remove();
          }
        }
    }

    public static HashSet<Reserva> listaReserva(Usuario usuario){
        return mapa.get(usuario);
    }

    public static void reservaCrear(Usuario usuario, Pista pista){
        Reserva reserva = new Reserva(usuario,pista);

        HashSet<Reserva> listajacobo = listaReserva(usuario);
        if (listajacobo.contains(reserva)){
            throw new ReservaDuplicada("Ya hay una pista reservada");
        }else {
            listajacobo.add(reserva);
            mapa.put(usuario,listajacobo);
        }
    }

}
