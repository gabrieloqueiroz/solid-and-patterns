package br.com.goqueiroz;

import br.com.goqueiroz.vehicles.interfaces.IVehicle;
import br.com.goqueiroz.vehicles.interfaces.impl.Car;

public class CarTransport extends Transport{
    @Override
    IVehicle createTransport() {
        return new Car();
    }
}
