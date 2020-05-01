package primerejemploawt;

import java.awt.Frame;

public class Ventana extends Frame {

    public Ventana() {
        super("Mi primer ventana AWT");
        setSize(600, 340);
    }

    public static void main(String[] args) {
        Ventana principal = new Ventana();
        principal.setSize(400, 300);
        principal.setVisible(true);
    }
}