/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public class Motor {
    //Atributos
  
    public String Tamaño_Motor;
    //Constructor no parametrizado
    public Motor() {
    }
    
    //Constructor  parametrizado
    public Motor(String Tamaño_Motor) {
        this.Tamaño_Motor = Tamaño_Motor;
    }
    
    //Setters y Getters

    public String getTamaño_Motor() {
        return Tamaño_Motor;
    }

    public void setTamaño_Motor(String Tamaño_Motor) {
        this.Tamaño_Motor = Tamaño_Motor;
    }

    

    
    
}
