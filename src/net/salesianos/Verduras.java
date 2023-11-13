package net.salesianos;

import java.util.Random;

public class Verduras {

    Random verduraAleatoria = new Random();
    private String nombreVerduras[] = {"lettuce", "cabbage", "onion", "spinach",
            "potato", "celery", "asparagus", "radish", "broccoli", "artichoke", "tomato", "cucumber",
            "eggplant", "carrot", "green bean"};

    private int tiempo;

    //Random random = new Random();
        //int posicionAleatoriaNombreDeVerduras = random.nextInt();
   public String getNombreVerduras() {
       Random random = new Random();
       int posicionAleatoriaNombreDeVerduras = (int) (Math.random()*10 + 1);
        return nombreVerduras[posicionAleatoriaNombreDeVerduras];
    }

    public int getTiempo() {
        return (int) (Math.floor(Math.random() * this.tiempo) * 10);
    }




}


