/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.Abstracciones;

/**
 *
 * @author Estudiante
 */
public class Elemento {
    //Atributos
    private int nivel;
    //Constructores
    public Elemento(int nivel) {
        this.nivel = nivel;
    }
    
    public Elemento(){}
    
    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }
    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
