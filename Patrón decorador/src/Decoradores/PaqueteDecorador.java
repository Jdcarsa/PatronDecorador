package Decoradores;

public class PaqueteDecorador implements IPaqueteViaje {

    private IPaqueteViaje paqueteV;
    private String nombrePaquete;
    private double precio = 7000;
    private int dias = 5;
    

    public PaqueteDecorador(IPaqueteViaje paqueteV) {
        this.paqueteV = paqueteV;
    }

   
    @Override
    public void mostrarCaracteristicasViaje() {
        paqueteV.toString();
    }
    
    @Override
    public String toString() {
        return "Caracteristicas del Paquete "+ nombrePaquete  + "\nPrecio: " + precio + ",      Dias: " + dias
                + "\nDescripcion: Tiquetes aereos , habitacion en hotel estandar , alimentacion , vuelta a la isla  y recepcion con "
                + "lei hawaino y camiseta de millonarios";
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    
    
}
