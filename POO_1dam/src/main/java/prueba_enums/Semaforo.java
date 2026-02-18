package prueba_enums;

public enum Semaforo {

    AMARILLO, ROJO, VERDE;

    public Semaforo siguiente() {
        switch (this) {
            case ROJO:
                return VERDE;
            case AMARILLO:
                return ROJO;
            default:
                return AMARILLO;
        }
    }

}
