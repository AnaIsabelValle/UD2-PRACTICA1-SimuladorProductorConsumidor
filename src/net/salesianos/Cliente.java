package net.salesianos;

public class Cliente extends Thread {

    private int cantidadVerdura;
    private String nombre;
    private Restaurante restaurante;

    public Cliente(String nombre, int cantidadVerdura, Restaurante restaurante) {
        this.nombre = nombre;
        this.cantidadVerdura = cantidadVerdura;
        this.restaurante = restaurante;
    }

    public void comerVerdura() {
        int tiempoMaximoDeCrecimiento = 10000;
        int tiempoCrecimiento = (int) (Math.floor(Math.random() * tiempoMaximoDeCrecimiento));

        try {
            Thread.sleep(tiempoCrecimiento);
            restaurante.consumirVerdura(this.nombre);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < this.cantidadVerdura; i++) {
            comerVerdura();
            System.out.println(restaurante.getArrayVerdura());
        }
    }
}
