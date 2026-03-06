package excepciones;

public class EdadValidad extends RuntimeException {

    public EdadValidad() {
        super("Edad no permitida.");
    }
}
