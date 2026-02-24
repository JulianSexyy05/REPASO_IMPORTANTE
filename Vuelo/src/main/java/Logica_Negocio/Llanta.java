/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Llanta {
    
    //Atributos
  
    public String tamaño;
    //Constructor no parametrizado
    
    public Llanta() {
    }
    
    //Constructor  parametrizado

    public Llanta(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
    //Setters y Getters

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    
}
