package br.com.goqueiroz.vehicles;

import br.com.goqueiroz.components.CarType;
import br.com.goqueiroz.components.Engine;
import br.com.goqueiroz.components.Transmission;

public class Car {
    private final int seats;
    private final CarType carType;
    private final Transmission transmission;
    private final Engine engine;


    public Car(CarType carType, Engine engine, Transmission transmission, int seats){
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
        return "Car constructed with power: " + this.getEngine().getPower() + "\n"
                + " with type: " + this.getCarType();
    }
}
