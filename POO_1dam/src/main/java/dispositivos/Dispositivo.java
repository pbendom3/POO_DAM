package dispositivos;

public abstract class Dispositivo {

    protected String nombre;
    protected boolean estado;

    public Dispositivo (String nombre){
        this.nombre=nombre;
        estado=false;
    }

    public abstract void encender();

    public void apagar(){

        if(estado){
            estado=false;
            System.out.println(nombre + " apagado.");
        }else{
            System.out.println(nombre + " ya está apagado.");
        }

    }

    public void mostrarEstado(){

        if (estado){
            System.out.println(nombre + " encendido.");
        }else{
            System.out.println(nombre + " apagado.");
        }

    }



}
