package br.com.goqueiroz.buiders;

import br.com.goqueiroz.components.CarType;
import br.com.goqueiroz.components.Engine;
import br.com.goqueiroz.components.Transmission;
import br.com.goqueiroz.vehicles.Truck;

public class TruckBuilder implements IBuilder{
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private CarType carType;
    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Truck getResult() {
        return new Truck(this.carType, this.engine, this.transmission, this.seats);
    }
}
