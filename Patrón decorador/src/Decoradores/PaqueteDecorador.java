package Decoradores;

public  class PaqueteDecorador implements IPaqueteViaje {

    private IPaqueteViaje paqueteV;

   
    public PaqueteDecorador(IPaqueteViaje paqueteV) {
        this.paqueteV = paqueteV;
    }

    public IPaqueteViaje getPaqueteV() {
        return paqueteV;
    }

    @Override
    public void mostrarCaracteristicasViaje() {
     paqueteV.mostrarCaracteristicasViaje();
    }



    
    
}
