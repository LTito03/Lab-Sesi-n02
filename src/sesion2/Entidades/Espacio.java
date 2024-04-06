/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.Entidades;

import sesion2.Abstracciones.Elemento;

/**
 *
 * @author Estudiante
 */
public class Espacio extends Elemento {
    //Atributos
    private int tiempo;
    private int ambiente;
    
    public Espacio(){}

    public Espacio(int tiempo, int nivel, int ambiente) {
        super(nivel);
        this.tiempo = tiempo;
        this.ambiente = ambiente;
    }

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the ambiente
     */
    public int getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(int ambiente) {
        this.ambiente = ambiente;
    }
    
    
}
