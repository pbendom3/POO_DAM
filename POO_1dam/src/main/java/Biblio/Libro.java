package Biblio;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;

    private static final String CADENA_ID = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro (String titulo, String autor, Editorial editorial){
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        id = generarId();
        estudiantePrestado = null;
        this.editorial=editorial;
    }

    private String generarId (){
        return CADENA_ID+cantidadLibros;
    }

    public Prestamo prestar(Estudiante estudiante){

        Prestamo prestamo = null;

        if (disponible && !estudiante.getListaLibros().contains(this)){
            disponible=false;
            System.out.println("El libro "+ titulo + " ha sido prestado a " + estudiante.getNombre() + " de " + estudiante.getCurso());
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.insertarLibro(this);
            prestamo = new Prestamo(this,estudiante);
            System.out.println("Préstamo realizado con éxito.");
        } else if (estudiante.getListaLibros().contains(this)) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene el libro " + titulo + " prestado");
        } else{
            System.out.println("El libro " + titulo + " no está disponible.");
        }

        return prestamo;

    }

    public void devolver(){

        if (!disponible){
            disponible=true;
            System.out.println("El libro " + titulo + " ha sido devuelto por " + estudiantePrestado.getNombre() + " de " + estudiantePrestado.getCurso());
            librosDisponibles++;
            estudiantePrestado.borrarLibro(this);
            estudiantePrestado = null;
        }else{
            System.out.println("El libro " + titulo + " está disponible. No se puede devolver.");
        }

    }

    public boolean estaDisponible (){
        return disponible;
    }

    public static int getTotalLibros(){
        return cantidadLibros;
    }

    public static int getLibrosDisponibles(){
        return librosDisponibles;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                ", estudiante=" + estudiantePrestado +
                ", editorial= " + editorial +
                '}';
    }


}
