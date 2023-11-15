import net.salesianos.Cliente;
import net.salesianos.Granjero;
import net.salesianos.Restaurante;
import net.salesianos.Verdura;

public class Main {
    public static void main(String[] args) {

        Restaurante restaurante1 = new Restaurante(5);


        Granjero granjero1 = new Granjero("Ana", 5, restaurante1);


        Cliente cliente1 = new Cliente("Alba", 5, restaurante1);

        granjero1.start();


        cliente1.start();
    }
}