
package decoradoresConcretos;

import Decoradores.IPaqueteViaje;
import Decoradores.PaqueteDecorador;


public class PaqueteAmazingHawaii extends PaqueteDecorador {
    
     private String nombrePaquete = "Amazing Hawaii";
    private double precio = 7931;
    private int dias = 8;

    public PaqueteAmazingHawaii(IPaqueteViaje paqueteV) {
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
    public void mostrarCaracteristicasViaje(){
         super.mostrarCaracteristicasViaje();
        System.out.println(toString());
        agregarLugares();
    }
    
    public void agregarLugares(){
        System.out.println("Ahora se puede escalar en el Waipio Valley, surfear en las playas Waikiki o Hanalei Bay y bucear en Hanauma Bay.\n");
    }
}
