package br.com.goqueiroz.vehicles;

import br.com.goqueiroz.components.*;

public class SportCar extends Car {
    public Colors colors;
    public Brands brands;
    public SportCar(
            CarType carType,
            Engine engine,
            Transmission transmission,
            int seats,
            Brands brand,
            Colors color) {
        super(carType, engine, transmission, seats);
         this.colors = color;
         this.brands = brand;
    }

    public Colors getColors() {
        return colors;
    }

    public Brands getBrands() {
        return brands;
    }

    @Override
    public String getResult() {
        return super.getResult() + " - with color: " + this.colors + "  - amazing brand " + this.brands;
    }
}
