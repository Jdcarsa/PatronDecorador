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
public class PaquetePearlHarbor extends PaqueteDecorador{
    
    public PaquetePearlHarbor(IPaqueteViaje planDecorador) {
        super(planDecorador);
        setNombrePaquete("Paquete Pearl Harbor");
        setDias(super.getDias() + 2); 
        setPrecio(super.getPrecio()  + 653);
    }
    
    @Override
    public void mostrarCaracteristicasViaje(){
        System.out.println(toString());
        agregarLugares();
    }
    
    public void agregarLugares(){
        System.out.println("Ahora se puede visitar el palacio Iolani, el museo Bishop y el USS Arizona Memorial.\n");
    }
}
