package net.salesianos;

public class Verdura {
    private String nombreVerduras[] = {"lettuce", "cabbage", "onion", "spinach",
            "potato", "celery", "asparagus", "radish", "broccoli", "artichoke", "tomato", "cucumber",
            "eggplant", "carrot", "green bean"};
    private int tiempoMaximoDeCrecimiento = 100;

    public String getVerduraAleatoria() {
        int indiceAleatorio = (int) (Math.random() * nombreVerduras.length);
        return nombreVerduras[indiceAleatorio];
    }

    public int getTiempoCrecimiento() {
        return (int) (Math.floor(Math.random() * this.tiempoMaximoDeCrecimiento));
    }
}


