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
public class PaqueteNature extends PaqueteDecorador{
    
    public PaqueteNature(IPaqueteViaje planDecorador) {
        super(planDecorador);
        setNombrePaquete("Paquete Nature");
        setDias(super.getDias() + 5); 
        setPrecio(super.getPrecio()  + 720);
    }
    
    @Override
    public void mostrarCaracteristicasViaje(){
        System.out.println(toString());
        agregarLugares();
    }
    
    public void agregarLugares(){
        System.out.println("Ahora se puede visitar el Kualoa Ranch, el Maui Ocean Center y el Akaka Falls  State Park.\n");
    }
}
