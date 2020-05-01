package gridlayout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana2 extends Frame {
    Button btn = new Button("Presioname");
    Button btn2 = new Button("En segundo lugar a este");
    Button btn3 = new Button("Despues a este");
    Button btn4 = new Button("Por último este");
    /** Creates a new instance of Ventana2 */
    public Ventana2(){
        super("Ventana con eventos");
        setSize(400, 300);
        setResizable(false);
        setLayout(new GridLayout(3, 2));
        add(btn, 0);
        add(btn2, 1);
        add(btn3, 2);
        add(btn4, 3);
        
        addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );
    }
    
    public static void main(String[] args) {
        Ventana2 principal = new Ventana2();
        principal.setSize(400, 300);
        principal.setVisible(true);
    }
}