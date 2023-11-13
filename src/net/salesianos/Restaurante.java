package net.salesianos;

import java.util.ArrayList;

public class Restaurante {

    private int capacidadDeAlmacenamiento;
    private ArrayList<String> arrayVerdura;


    public Restaurante(int capacidad){
        this.capacidadDeAlmacenamiento = capacidad;
        this.arrayVerdura = new ArrayList<>();
    }

    public synchronized void guardarVerdura(String verdura, String nombreGranjero) {
        while (capacidadDeAlmacenamiento <= arrayVerdura.size()){
            System.out.println("El restaurante está lleno");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.arrayVerdura.add(verdura);
        System.out.println("El granjero " + nombreGranjero + " ha plantado " + verdura );
    }
}
