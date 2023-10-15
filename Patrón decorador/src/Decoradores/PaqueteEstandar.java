package Decoradores;

public  class PaqueteEstandar implements IPaqueteViaje {

    private String nombrePaquete = "Estandar";
    private double precio = 7000;
    private int dias = 5;

    public PaqueteEstandar(){
        
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
        System.out.println(toString());
    }

}
