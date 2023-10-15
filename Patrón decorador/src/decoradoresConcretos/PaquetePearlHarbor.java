/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradoresConcretos;

import Decoradores.IPaqueteViaje;
import Decoradores.PaqueteDecorador;

/**
 *
 * @author IngSis
 */
public class PaquetePearlHarbor extends PaqueteDecorador {

    private String nombrePaquete = "Pearl Harbor";
    private double precio = 7931;
    private int dias = 8;

    public PaquetePearlHarbor(IPaqueteViaje paqueteV) {
        super(paqueteV);
    }

    @Override
    public String toString() {
        return "Caracteristicas del Paquete " + nombrePaquete + " precio: " + precio + ", dias: " + dias
                + " tiquetes aereos , habitacion en hotel estandar , alimentacion , vuelta a la isla  y recepcion con "
                + "lei hawaino y camiseta de millonarios";
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public void mostrarCaracteristicasViaje() {
        super.mostrarCaracteristicasViaje();
        System.out.println(toString());
        agregarLugares();
    }

    public void agregarLugares() {
        System.out.println("Ahora se puede escalar en el Waipio Valley, surfear en las playas Waikiki o Hanalei Bay y bucear en Hanauma Bay.\n");
    }
}
