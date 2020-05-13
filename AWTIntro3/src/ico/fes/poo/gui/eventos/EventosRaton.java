/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author vik
 */
public class EventosRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Evento Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Evento Pressed");
        System.out.println("Coordenada X="+e.getX());
        System.out.println("Coordenada Y="+e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Evento Released");
        System.out.println("Coordenada X="+e.getX());
        System.out.println("Coordenada Y="+e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Evento Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Evento Exited");
    }
    
}
