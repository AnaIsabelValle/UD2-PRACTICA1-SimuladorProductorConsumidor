import net.salesianos.Cliente;
import net.salesianos.Granjero;
import net.salesianos.Restaurante;
import net.salesianos.Verdura;

public class Main {
    public static void main(String[] args) {

        Restaurante restaurante1 = new Restaurante(20);


        Granjero granjero1 = new Granjero("Ana", 10, restaurante1);
        Granjero granjero2 = new Granjero("Isabel", 10, restaurante1);

        Cliente cliente1 = new Cliente("Alba", 20, restaurante1);

        granjero1.start();
        granjero2.start();

        cliente1.start();
    }
}