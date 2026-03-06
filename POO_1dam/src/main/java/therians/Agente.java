package therians;

import java.util.ArrayList;
import java.util.Scanner;

public class Agente extends Persona implements AccionesPoliciales{

    static Scanner teclado = new Scanner(System.in);

    private static int contador = 0;
    private int id;
    private int codigo_acceso;

    public Agente(String nombre, String poblacion, int codigo_acceso) {
        super(nombre, poblacion);
        setId();
        this.codigo_acceso = codigo_acceso;
    }

    public Agente(int id,int codigo_acceso) {
        super(" "," ");
        this.id = id;
        this.codigo_acceso = codigo_acceso;
    }

    public boolean login(ArrayList<Agente> agentesPoliciaRegistrados) {
        System.out.println("=== BIENVENIOD A LA APP DEL CENSO DE BESTIAS DE MUTXAMEL ===");
        System.out.println("Introduce tu id");
        int id = teclado.nextInt();
        System.out.println("Introduce tu código de acceso");
        teclado.nextLine();
        return true;

    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = ++contador;
    }

    public int getCodigo_acceso() {
        return codigo_acceso;
    }

    public void setCodigo_acceso(int codigo_acceso) {
        this.codigo_acceso = codigo_acceso;
    }


    @Override
    public void mostrarTipoPersona() {

    }

    @Override
    public Ciudadano solicitarDatosCiudadano() {
        System.out.println("Creando expediente");
        System.out.println("Introduce los datos del Ciudadano a registrar");
        System.out.println("Nombre:");
        String nombre = teclado.next();
        System.out.println("Poblacion");
        String poblacion = teclado.next();
        System.out.println("DNI:");
        String dni = teclado.next();

        Ciudadano c1 = new Ciudadano(nombre,poblacion, dni);
        return c1;
    }

    @Override
    public Expediente crearExpediente() {
        Ciudadano c1 = solicitarDatosCiudadano();
        Expediente e1 = new Expediente(c1,EstadoTramite.INICIADO);
        System.out.println("Expediente para el ciudadano " + c1.getNombre());
        return e1;
    }

    @Override
    public void siguienteEstado(Expediente expediente) {
        Expediente e1 = crearExpediente();
        if (e1.getEstado().equals(EstadoTramite.INICIADO)) {
                e1.setEstado(EstadoTramite.COMPLETADO);
                System.out.println("Agente modificando estado: INICIADO a COMPLETADO");
        }
    }

    @Override
    public void archivarExpediente(Expediente expediente) {
        expediente.setEstado(EstadoTramite.PAGADO);
        System.out.println("Expediente archivado");

    }

    @Override
    public String toString() {
        return "Agente{" +
                "id=" + id +
                ", codigo_acceso=" + codigo_acceso +
                '}';
    }
}
