package br.com.goqueiroz;

import br.com.goqueiroz.vehicles.interfaces.IVehicle;
import br.com.goqueiroz.vehicles.interfaces.impl.Bike;

public class BikeTransport extends Transport{
    @Override
    IVehicle createTransport() {
        return new Bike();
    }
}
