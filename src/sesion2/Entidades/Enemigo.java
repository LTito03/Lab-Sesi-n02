/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.Entidades;

import sesion2.Abstracciones.Personaje;

/**
 *
 * @author Estudiante
 */
public class Enemigo extends Personaje {
    
    //Atributos
    private int tipo;
    
    public Enemigo(){}
    
    public Enemigo(int vidas, int tipo, int nivel){
        super(nivel, vidas);
        this.tipo=tipo;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public void setTipo(int tipo){
        this.tipo=tipo;
    }
    
    
    
}
