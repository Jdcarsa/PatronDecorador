
package Main;

import Decoradores.IPaqueteViaje;

import Decoradores.PaqueteEstandar;
import decoradoresConcretos.PaqueteAmazingHawaii;
import decoradoresConcretos.PaqueteNature;
import decoradoresConcretos.PaquetePearlHarbor;


public class Main {


    public static void main(String[] args) {

        IPaqueteViaje paquete = new PaqueteEstandar();//Paquete base
        paquete = new PaquetePearlHarbor(paquete);
        paquete = new PaqueteNature(paquete); //Paquete Nature
        
        paquete = new PaqueteAmazingHawaii(paquete); //Paquete Amazing Hawaii
        paquete.mostrarCaracteristicasViaje(); //Caracteristicas del Paquete Amazing Hawaii
    }
    
}
