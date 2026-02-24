/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class Avion {
    //Atributos
    public String Marca;
    public Fuselaje objFuselaje;
    public ArrayList<Motor> listamotores;
    public ArrayList<Ala> listaalas;
    public ArrayList<Llanta> listallantas;
    
   
    //Constructor no parametrizado
    public Avion() {
    }
    
    //Constructor  parametrizado
       public Avion(String Marca, Fuselaje objFuselaje, ArrayList<Motor> listamotores, ArrayList<Ala> listaalas, ArrayList<Llanta> listallantas) {
        this.Marca = Marca;
        this.objFuselaje = objFuselaje;
        this.listamotores = listamotores;
        this.listaalas = listaalas;
        this.listallantas = listallantas;
    }
    
    //Setters y Getters

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Fuselaje getObjFusejale() {
        return objFuselaje;
    }

    public void setObjFusejale(Fuselaje objFusejale) {
        this.objFuselaje = objFusejale;
    }

    public ArrayList<Motor> getListamotores() {
        return listamotores;
    }

    public void setListamotores(ArrayList<Motor> listamotores) {
        this.listamotores = listamotores;
    }

    public ArrayList<Ala> getListaalas() {
        return listaalas;
    }

    public void setListaalas(ArrayList<Ala> listaalas) {
        this.listaalas = listaalas;
    }

    public ArrayList<Llanta> getListallantas() {
        return listallantas;
    }

    public void setListallantas(ArrayList<Llanta> listallantas) {
        this.listallantas = listallantas;
    }

 

    
    
}
