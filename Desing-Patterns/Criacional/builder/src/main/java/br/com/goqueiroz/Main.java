package br.com.goqueiroz;

import br.com.goqueiroz.buiders.CarBuilder;
import br.com.goqueiroz.buiders.SportCarBuilder;
import br.com.goqueiroz.buiders.TruckBuilder;
import br.com.goqueiroz.director.Director;
import br.com.goqueiroz.vehicles.Car;
import br.com.goqueiroz.vehicles.Truck;

public class Main {
    public static void main(String[] args) {

        TruckBuilder truckBuilder = new TruckBuilder();
        Director director = new Director();
        director.constructTruck(truckBuilder);

        Truck truckConstructed = truckBuilder.getResult();
        System.out.println(truckConstructed.getResult());

        CarBuilder carBuilder = new CarBuilder();
        director.constructSedanCar(carBuilder);
        Car car = carBuilder.getCar();
        System.out.println(car.getResult());

        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructSportCar(sportCarBuilder);
        Car sportCar = sportCarBuilder.getSportCar();
        System.out.println(sportCar.getResult());
    }
}