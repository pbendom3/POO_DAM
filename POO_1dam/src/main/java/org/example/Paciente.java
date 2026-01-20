package org.example;

import java.util.Random;

public class Paciente {

    static Random aleatorio = new Random();
    private static final char DEF_GENERO = 'X';
    private static final int INFRAPESO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;
    private static final int DEF_MAYOR_EDAD = 18;

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private int altura;

    public Paciente (String nombre, int edad, char genero, double peso, int altura){
        this.nombre = nombre;
        this.edad = edad;
        dni = generarDNI();
        this.genero = validarGenero(genero);
        this.peso = peso;
        this.altura = altura;
    }

    public Paciente(){
        this(null,0,DEF_GENERO,0,0);
    }

    private String generarDNI (){

        String dni = "";

        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        for (int i = 0; i < 8; i++) {
            int num = aleatorio.nextInt(10);
            dni = dni + num;
        }

        return dni + letras[Integer.parseInt(dni)%23];

    }

    public int calcularIMC (){

        double resultado = peso / Math.pow((double) altura/100,2);

        if (resultado < 20){
            return INFRAPESO;
        } else if (resultado > 25) {
            return SOBREPESO;
        }else{
            return PESO_IDEAL;
        }

    }

    public boolean esMayorDeEdad() {

        if (edad >= DEF_MAYOR_EDAD){
            return true;
        }else{
            return false;
        }

    }

    private char validarGenero (char genero){

        if (genero == 'H' || genero == 'M'){
            return genero;
        }else{
            return DEF_GENERO;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString(){

        return "Paciente [nombre = " + nombre + " edad= " + edad + " dni= " + dni +
                " genero= " + genero + " peso=" + peso + " altura= " + altura + "]";

    }

}
