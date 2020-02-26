/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivienda;

import componentes.Habitacion;
import componentes.Puerta;
import componentes.Ventana;

/**
 *
 * @author CrisFiss
 */
public class Casa {
    private String ubicacion;
    private float precio;
    private Puerta puerta;
    private Ventana ventana;
    private Habitacion habitacion;

    public Casa() {
    }

    public Casa(String ubicacion, float precio, Puerta puerta, Ventana ventana, Habitacion habitacion) {
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.puerta = puerta;
        this.ventana = ventana;
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
    
    public void limpiar() {
        System.out.println("Limpiando casa ...");
    }
    
    public void ensuciar() {
        System.out.println("Ensuciando casa ...");
    }
    
    @Override
    public String toString(){
        return " :: CASA :: " +
                "\n Ubicación: " + getUbicacion() +
                "\n Precio: " + getPrecio() +
                "\n Largo: " + this.habitacion.getLargo() +
                "\n Ancho: " + this.habitacion.getAncho();
    }
}
