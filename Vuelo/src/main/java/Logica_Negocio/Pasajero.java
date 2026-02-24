/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Santiago Lopez
 */
public abstract class Pasajero {
    //Atributos
    public String codigo, identificacion, nombre;
  
    
    //Constructor no parametrizado
    public Pasajero() {
    }
    
    //Constructor  parametrizado
     public Pasajero(String codigo, String identificacion, String nombre) {
        this.codigo = codigo;
        this.identificacion = identificacion;
        this.nombre=nombre;
    }
    
    //Setters y Getters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    
    
}
