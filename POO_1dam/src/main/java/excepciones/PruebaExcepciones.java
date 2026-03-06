package excepciones;

import java.util.zip.DataFormatException;

public class PruebaExcepciones {

    public static void main(String[] args) throws DataFormatException {

        int edad = 15;

        if (edad<18){
            throw new EdadValidad();
        }

    }
}
