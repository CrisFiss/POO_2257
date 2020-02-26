/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa_2257;

import componentes.Habitacion;
import vivienda.Casa;

/**
 *
 * @author CrisFiss
 */
public class Casa_2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Casa casa1 = new Casa();
        casa1.setHabitacion(new Habitacion(4.5f, 5.5f));
        System.out.println(casa1);
    }
    
}
