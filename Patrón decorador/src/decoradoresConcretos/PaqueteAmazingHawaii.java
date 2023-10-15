
package decoradoresConcretos;

import Decoradores.IPaqueteViaje;
import Decoradores.PaqueteDecorador;


public class PaqueteAmazingHawaii extends PaqueteDecorador {
    
    public PaqueteAmazingHawaii (IPaqueteViaje planDecorador) {
        super(planDecorador);
        setNombrePaquete("Paquete Amazing Hawaii");
        setDias(super.getDias() + 3); 
        setPrecio(super.getPrecio()  + 931);
    }
    
    @Override
    public void mostrarCaracteristicasViaje(){
        System.out.println(toString());
        agregarLugares();
    }
    
    public void agregarLugares(){
        System.out.println("Ahora se puede escalar en el Waipio Valley, surfear en las playas Waikiki o Hanalei Bay y bucear en Hanauma Bay.\n");
    }
}
