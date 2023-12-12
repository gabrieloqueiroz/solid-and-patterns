package br.com.goqueiroz;

import br.com.goqueiroz.vehicles.interfaces.IVehicle;

// Classe Factory
public abstract class Transport {

    public void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    abstract IVehicle createTransport();
}
