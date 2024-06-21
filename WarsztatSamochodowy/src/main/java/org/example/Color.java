package org.example;

public enum Color {
    BLACK("#000000"),
    WHITE("#FFFFFF"),
    RED("#FF0000");

    private final String hex;  // Pole przechowujące zapis szesnastkowy koloru
    Color(String hex) {
        this.hex = hex;
    }

    // Metoda zwracająca zapis szesnastkowy koloru
    public String getHex() {
        return hex;
    }
}
