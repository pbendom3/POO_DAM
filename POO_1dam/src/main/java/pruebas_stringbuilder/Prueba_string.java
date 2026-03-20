package pruebas_stringbuilder;

public class Prueba_string {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();

        sb.append("Calleu ");
        sb.append("mantecao ").append(" Joaquín!!").append(" adiós");

        sb.insert(16, " de limón");
        sb.replace(26,35,"Jacobo");
        sb.delete(26,32);
       // Calleu mantecao  de limón Jacobo adiós
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
