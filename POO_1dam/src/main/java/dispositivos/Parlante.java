package dispositivos;

public class Parlante extends Dispositivo {

    public Parlante(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (super.estado){
            System.out.println("El parlante ya está encendido.");
        }else{
            System.out.println("Activando parlante con comando de voz...");
            super.estado=true;
        }
    }

}
