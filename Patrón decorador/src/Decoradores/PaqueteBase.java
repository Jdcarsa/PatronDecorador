
package Decoradores;


public class PaqueteBase implements IPaqueteViaje {
    
    private double precio = 7000;
    private int dias = 5;

    
    
    @Override
    public String toString() {
        return "PaqueteBase{" + "precio=" + precio + ", dias=" + dias + '}';
    }

    @Override
    public void mostrarCaracteristicasViaje() {
       toString();
    }

    
    
}
