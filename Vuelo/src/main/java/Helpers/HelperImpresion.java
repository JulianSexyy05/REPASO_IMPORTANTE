/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Ala;
import Logica_Negocio.Llanta;
import Logica_Negocio.Motor;
import Logica_Negocio.Vuelo;
import java.util.ArrayList;

/**
 *
 * @author Santiago Lopez
 */
public class HelperImpresion implements IHelperImpresion {

    @Override
    public void ImprimirInfoVuelo(Vuelo objVuelo) {

        ArrayList<Motor> listamotores;
        ArrayList<Ala> listaalas;
        ArrayList<Llanta> listallantas;

        System.out.println("El id del vuelo es:" + "\t" + objVuelo.getId_Vuelo());
        System.out.println("La aerolinea del vuelo es:" + "\t" + objVuelo.getAerolinea());
        System.out.println("El nombre del pasajero es" + "\t" + objVuelo.getObjPasajero().getNombre());
        System.out.println("La identificacion del pasajero es" + "\t" + objVuelo.getObjPasajero().getIdentificacion());
        System.out.println("El codigo del pasajero es" + "\t" + objVuelo.getObjPasajero().getCodigo());
        System.out.println("La marca del avion es" + "\t" + objVuelo.getObjAvion().getMarca());
        System.out.println("El fuselaje del avion es" + "\t" + objVuelo.getObjAvion().getObjFusejale().getNombre());

        listaalas = objVuelo.getObjAvion().getListaalas();
        listamotores = objVuelo.getObjAvion().getListamotores();
        listallantas = objVuelo.getObjAvion().getListallantas();

        for (int i = 0; i < 2; i++) {
            System.out.println("Las alas del avion son" + "\t" + listaalas.get(i).getPosicion());
            System.out.println("Los motores del avion son" + "\t" + listamotores.get(i).getTamaño_Motor());
            System.out.println("Las Llantas del avion son" + "\t" + listallantas.get(i).getTamaño());
        }
    }

    public static void ImprimirInfoVueloAdapter(Vuelo vuelo) {
        HelperImpresion objHelperImpresion = new HelperImpresion();
        objHelperImpresion.ImprimirInfoVuelo(vuelo);
    }

}
