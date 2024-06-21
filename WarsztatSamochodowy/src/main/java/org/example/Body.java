package org.example;

public class Body {
    private Color color;
    public Body(Color color) {
        this.color = color;
    }

    // Metoda zwracająca kolor karoserii
    public Color getColor() {
        return color;
    }

    // Metoda zwracająca tekstową reprezentację obiektu Body
    @Override
    public String toString() {
        return "Body{" +
                "color=" + color +
                ", hex='" + color.getHex() + '\'' +
                '}';
    }
}
