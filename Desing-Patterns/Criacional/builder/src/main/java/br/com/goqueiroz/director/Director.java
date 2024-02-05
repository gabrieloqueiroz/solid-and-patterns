package br.com.goqueiroz.director;

import br.com.goqueiroz.buiders.IBuilder;
import br.com.goqueiroz.buiders.SportCarBuilder;
import br.com.goqueiroz.components.*;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setEngine(new Engine(1800));
        builder.setSeats(5);
        builder.setTransmission(Transmission.MANUAL);
    }

    public void constructTruck(IBuilder builder){
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(3);
        builder.setEngine(new Engine(13000));
        builder.setCarType(CarType.TRUCK);
    }
    public void constructSportCar(SportCarBuilder builder){
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setSeats(2);
        builder.setEngine(new Engine(4000));
        builder.setCarType(CarType.SPORT);
        builder.setBrand(Brands.PORSCHE);
        builder.setColor(Colors.YELLOW);
    }

}
