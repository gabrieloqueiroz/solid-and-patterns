package br.com.goqueiroz.vehicles;

import br.com.goqueiroz.components.CarType;
import br.com.goqueiroz.components.Engine;
import br.com.goqueiroz.components.Transmission;

public class Truck {
    private final int seats;
    private final CarType carType;
    private final Transmission transmission;
    private final Engine engine;

    public Truck(CarType carType, Engine engine, Transmission transmission, int seats){
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public CarType getCarType() {
        return carType;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getResult(){
        String truckResult =  "Truck constructed with power: " + this.engine.getPower() + "\n";
        truckResult += "And with " + this.seats + "seats.";

        return truckResult;
    }
}
