package net.salesianos;

public class Granjero extends Thread {

    private String nombre;
    private int cantidadVerdurasAPlantar;

    public Granjero(String nombre, int cantidadVerduras) {
        this.nombre = nombre;
        this.cantidadVerdurasAPlantar = cantidadVerduras;
    }

    public void plantarVerdura() {
        Verdura verdura = new Verdura();
        String nombreVerdura = verdura.getVerduraAleatoria();
        int tiempoCrecimiento = verdura.getTiempoCrecimiento();

        try {
            Thread.sleep(tiempoCrecimiento);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Guardar verdura en el restaurante

    }
    @Override
    public void run() {
    }
}
