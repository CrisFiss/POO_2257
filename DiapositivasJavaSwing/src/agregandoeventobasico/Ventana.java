package agregandoeventobasico;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame {

    public Ventana() {
        super("Mi primer ventana AWT");
        setSize(600, 340);
        
        addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );
    }

    public static void main(String[] args) {
        Ventana principal = new Ventana();
        principal.setSize(400, 300);
        principal.setVisible(true);
    }
}