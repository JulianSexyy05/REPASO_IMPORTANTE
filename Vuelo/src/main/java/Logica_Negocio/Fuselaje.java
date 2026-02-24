/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Fuselaje {
    //Atributos
  
    public String nombre;
    
    //Constructor no parametrizado

        public Fuselaje() {
    }
    
    //Constructor  parametrizado
    
    public Fuselaje(String nombre) {
        this.nombre = nombre;
    }
    
    //Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
