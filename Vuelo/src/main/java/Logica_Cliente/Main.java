/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Ala;
import Logica_Negocio.Avion;
import Logica_Negocio.Comun;
import Logica_Negocio.Fuselaje;
import Logica_Negocio.Llanta;
import Logica_Negocio.Motor;
import Logica_Negocio.Pasajero;
import Logica_Negocio.VIP;
import Logica_Negocio.Vuelo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Santiago Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String codigo, identificacion, nombre;
        String marca, fuselaje, motor1, motor2, ala1, ala2;
        String Id_Vuelo, Aerolinea;
        
        Fuselaje objFuselaje;
        Motor objMotor1;
        Motor objMotor2;
        Ala objAla1;
        Ala objAla2;
        Llanta objLlanta1 = new Llanta("Grande");
        Llanta objLlanta2= new Llanta("Grande");
        
        ArrayList<Motor> listamotores = new ArrayList<>();
        ArrayList<Ala> listaalas = new ArrayList<>();
        ArrayList<Llanta> listallantas = new ArrayList<>();
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite el codigo del cliente");
        codigo=scan.nextLine();
        
        System.out.println("Digite la identificacion del cliente");
        identificacion=scan.nextLine();
        
        System.out.println("Digite el nombre del cliente");
        nombre=scan.nextLine();
        
        System.out.println("Digite la marca del avion");
        marca=scan.nextLine();
        
        System.out.println("Digite el tipo de fuselaje del avion");
        fuselaje=scan.nextLine();
        objFuselaje= new Fuselaje(fuselaje);
        
        System.out.println("Digite el tamaño del motor 1 del avion");
        motor1=scan.nextLine();
        objMotor1= new Motor(motor1);
        
        System.out.println("Digite el tamaño del motor 2 del avion");
        motor2=scan.nextLine();
        objMotor2= new Motor(motor2);
        
        System.out.println("Digite la posicion del ala 1 del avion");
        ala1=scan.nextLine();
        objAla1= new Ala(ala1);
        
        System.out.println("Digite la posicion del ala 2 del avion");
        ala2=scan.nextLine();
        objAla2= new Ala(ala2);
        
        listamotores.add(objMotor1);
        listamotores.add(objMotor2);
        
        listaalas.add(objAla1);
        listaalas.add(objAla2);
        
        listallantas.add(objLlanta1);
        listallantas.add(objLlanta2);
        
        System.out.println("Digite el id del vuelo");
        Id_Vuelo=scan.nextLine();
        
        System.out.println("Digite la aerolinea del vuelo");
        Aerolinea=scan.nextLine();
  
        
        Pasajero objPasajero= new VIP(codigo, identificacion, nombre);
        if(objPasajero instanceof VIP)
        {
            System.out.println("Es VIP");
        }else if(objPasajero instanceof Comun)
        {
            System.out.println("Es comun");
        }
        Avion objAvion= new Avion(marca, objFuselaje, listamotores, listaalas, listallantas);
        Vuelo objVuelo = new Vuelo(Id_Vuelo, Aerolinea, objAvion, objPasajero);
        
        Helpers.HelperImpresion.ImprimirInfoVueloAdapter(objVuelo);
        
    }
    
}
