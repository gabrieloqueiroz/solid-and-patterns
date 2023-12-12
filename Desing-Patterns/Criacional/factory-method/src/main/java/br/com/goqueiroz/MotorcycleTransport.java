package br.com.goqueiroz;

import br.com.goqueiroz.vehicles.interfaces.IVehicle;
import br.com.goqueiroz.vehicles.interfaces.impl.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    IVehicle createTransport() {
        return new Motorcycle();
    }
}
