package flowlayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana2 extends Frame {
    Button btn = new Button("Norte");
    Button btn2 = new Button("Sur");
    Button btn3 = new Button("Este");
    Button btn4 = new Button("Oeste");
    /** Creates a new instance of Ventana2 */
    public Ventana2(){
        super("Ventana con eventos");
        setSize(400, 300);
        setResizable(false);
        setLayout(new FlowLayout());
        add(btn);
        add(btn2);
        add(btn3);
        add(btn4);
        
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