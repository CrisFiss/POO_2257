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
public class Ventana {
    private String material;
    private boolean polarizada;

    public Ventana() {
    }

    public Ventana(String material, boolean polarizada) {
        this.material = material;
        this.polarizada = polarizada;
    }

    public boolean isPolarizada() {
        return polarizada;
    }

    public void setPolarizada(boolean polarizada) {
        this.polarizada = polarizada;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void abrir() {
        System.out.println("Abriendo ventana ...");
    }
    
    public void cerrar() {
        System.out.println("Cerrando ventana ...");
    }
}
