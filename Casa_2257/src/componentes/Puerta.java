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
public class Puerta { 
    private int numChapas;
    private boolean barnizada;

    public Puerta() {
    }

    public Puerta(int numChapas, boolean barnizada) {
        this.numChapas = numChapas;
        this.barnizada = barnizada;
    }

    public boolean isBarnizada() {
        return barnizada;
    }

    public void setBarnizada(boolean barnizada) {
        this.barnizada = barnizada;
    }

    public int getNumChapas() {
        return numChapas;
    }

    public void setNumChapas(int numChapas) {
        this.numChapas = numChapas;
    }
}
