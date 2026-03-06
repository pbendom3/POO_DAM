package therians;

import java.util.ArrayList;
import java.util.Scanner;

public class Expediente {

    static Scanner teclado = new Scanner(System.in);

    private Ciudadano ciudadano;
    private ArrayList<TipoSer> listaSeres;
    private EstadoTramite estado;

    public Expediente(Ciudadano ciudadano, EstadoTramite estado) {
        this.ciudadano = ciudadano;
        listaSeres = new ArrayList<>();
        this.estado = estado;
    }

    public void insertarSeres() {
        boolean control = false;
        do {
            control = false;
            System.out.println("Inserta el tipo de ser que quieres censar [THERIAN, DOMESTICO, EXOTICO]");
            String tipo = teclado.next().toUpperCase();
            if (tipo.equals(TipoSer.THERIAN) || tipo.equals(TipoSer.DOMESTICO) || tipo.equals(TipoSer.DOMESTICO)) {
                System.out.println("Importe tasas actual: ");
            } else {
                System.out.println("Tipo no contemplado");
            }
            System.out.println("¿Quieres añadir otro tipo de ser [S/N]: ");
            String volver = teclado.next().toUpperCase();
            if (volver == "N") {
                control = true;
            } else {
                control = false;
            }
        } while (control);

    }

    public void verTasas() {
        for (TipoSer tipoSer : listaSeres) {
            System.out.println("Importe tasa actual:");
        }
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public ArrayList<TipoSer> getListaSeres() {
        return listaSeres;
    }

    public void setListaSeres(ArrayList<TipoSer> listaSeres) {
        this.listaSeres = listaSeres;
    }

    public EstadoTramite getEstado() {
        return estado;
    }

    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }

    public void mostrarExpedientes() {
    }

    @Override
    public String toString() {
        return "Expediente{" +
                "ciudadano=" + ciudadano +
                ", listaSeres=" + listaSeres +
                ", estado=" + estado +
                '}';
    }


}
