package therians;

public enum TipoSer {
    THERIAN(0.0),DOMESTICO(10.0),EXOTICO(50.0);

    private final double numero_ser;

    TipoSer(double numeroSer) {
        numero_ser = numeroSer;
    }

}
