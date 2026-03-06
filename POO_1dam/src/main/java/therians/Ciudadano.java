package therians;

public class Ciudadano extends Persona {

    private String dni;

    public Ciudadano(String nombre, String poblacion,String dni) {
        super(nombre, poblacion);
        this.dni = dni;

    }

    public void abonarTasas(Expediente expediente) {
        System.out.println("El Ciudadano esta abonando Tasas...");
        expediente.setEstado(EstadoTramite.PAGADO);
        System.out.println("Estado del expediente " + expediente.getEstado());

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Ciudadano{" +
                "dni='" + dni + '\'' +
                '}';
    }

    @Override
    public void mostrarTipoPersona() {

    }
}
