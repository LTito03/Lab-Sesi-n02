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
public class Bala extends Elemento {
    //Atributos
    private int tipo;
    
    public Bala(){}
    
    public Bala(int nivel, int tipo) {
        super(nivel);
        this.tipo = tipo;
    }
    
    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
}
