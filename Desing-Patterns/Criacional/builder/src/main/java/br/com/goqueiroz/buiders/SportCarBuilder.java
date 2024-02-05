package br.com.goqueiroz.buiders;

import br.com.goqueiroz.components.*;
import br.com.goqueiroz.vehicles.Car;
import br.com.goqueiroz.vehicles.SportCar;

public class SportCarBuilder implements ISportBuilder {
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private CarType carType;
    private Colors color;
    private Brands brand;

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

    @Override
    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public void setBrand(Brands brand){
        this.brand = brand;
    }

    public Car getSportCar(){
        return new SportCar(this.carType, this.engine, this.transmission, this.seats, this.brand, this.color);
    }
}
