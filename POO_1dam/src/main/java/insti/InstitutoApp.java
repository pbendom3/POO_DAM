package insti;

public class InstitutoApp {

    public static void main(String[] args) {
        Instituto instituto = new Instituto();
        Instituto mariablasco = new Instituto("Maria Blasco","SAN VICENTE");

        mariablasco.setNombre(null);
        System.out.println(mariablasco);
        System.out.println(instituto);

    }

}
