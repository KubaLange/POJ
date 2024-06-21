package org.example;

public class Wheels {
    private int vMax;
    public Wheels(int vMax) {
        this.vMax = vMax;
    }

    // Metoda zwracająca maksymalną prędkość kół
    public int getVMax() {
        return vMax;
    }

    // Metoda zwracająca tekstową reprezentację obiektu Wheels
    @Override
    public String toString() {
        return "Wheels{" +
                "vMax=" + vMax +
                '}';
    }
}
