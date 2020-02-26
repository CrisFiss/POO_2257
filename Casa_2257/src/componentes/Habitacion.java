/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

/**
 *
 * @author CrisFiss
 */
public class Habitacion {
    private float largo;
    private float ancho;

    public Habitacion() {
    }

    public Habitacion(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }
    
    public void limpiar() {
        System.out.println("Limpiando habitación ...");
    }
    
    public void ensuciar() {
        System.out.println("Ensuciando habitación ...");
    }
}
