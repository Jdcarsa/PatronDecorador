
package Main;

import Decoradores.IPaqueteViaje;
import Decoradores.PaqueteDecorador;
import decoradoresConcretos.PaqueteAmazingHawaii;
import decoradoresConcretos.PaqueteNature;
import decoradoresConcretos.PaquetePearlHarbor;


public class Main {


    public static void main(String[] args) {

        IPaqueteViaje paquete = new PaqueteDecorador(null); //Paquete base
        
        paquete = new PaquetePearlHarbor(paquete); //Paquete Pearl Habor
        paquete.mostrarCaracteristicasViaje(); //Caracteristicas del Paquete Pearl Habor

        paquete = new PaqueteNature(paquete); //Paquete Nature
        paquete.mostrarCaracteristicasViaje(); //Caracteristicas del Paquete Nature
        
        paquete = new PaqueteAmazingHawaii(paquete); //Paquete Amazing Hawaii
        paquete.mostrarCaracteristicasViaje(); //Caracteristicas del Paquete Amazing Hawaii
    }
    
}
