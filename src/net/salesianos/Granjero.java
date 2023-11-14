package net.salesianos;

public class Granjero extends Thread {
    private String nombre;
    private int cantidadVerdurasAPlantar;
    private Restaurante restaurante;

    public Granjero(String nombre, int cantidadVerdura, Restaurante restaurante) {
        this.nombre = nombre;
        this.cantidadVerdurasAPlantar = cantidadVerdura;
        this.restaurante = restaurante;
    }

    public void plantarVerdura() {
        Verdura verdura = new Verdura();
        String nombreVerdura = verdura.getVerduraAleatoria();
        int tiempoCrecimiento = verdura.getTiempoCrecimiento();

        try {
            Thread.sleep(tiempoCrecimiento);
            restaurante.guardarVerdura(nombreVerdura, this.nombre);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < this.cantidadVerdurasAPlantar; i++) {
            plantarVerdura();
            System.out.println(restaurante.getArrayVerdura());
        }
    }
}
