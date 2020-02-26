/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author usuario-29
 */
public class Teclado {
    private String marca;
    private int numeroTeclas;

    public Teclado() {
    }

    public Teclado(String marca, int numerotECLAS) {
        this.marca = marca;
        this.numeroTeclas = numerotECLAS;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }
    
    public void encender(){
        System.out.println("Encendiendo la compu");
    }
}
