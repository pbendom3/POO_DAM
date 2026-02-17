package carrefour;

import java.util.ArrayList;

public class Seguridad extends Persona{

    private String empresa;
    private ArrayList<String> armas;

    public Seguridad(int codigo, String nombre, double sueldo, String empresa) {
        super(codigo, nombre, sueldo);
        this.empresa=empresa;
        armas=new ArrayList<>();
    }
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<String> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<String> armas) {
        this.armas = armas;
    }

    public void crearArmas(String arma){

        armas.add(arma);

    }

    @Override public void mostrarInfo(){

        super.mostrarInfo();
        System.out.println("La empresa de donde viene el de seguirdad es "+empresa);
        System.out.println("Las armas que tiene son: ");
        for (String arma:armas){
            System.out.println(arma);

        }
    }

    @Override
    public void trabajar() {
        System.out.println("Vigilando a sospechosos.");
    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "empresa='" + empresa + '\'' +
                ", armas=" + armas +
                '}';
    }
}
