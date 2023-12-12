package br.com.goqueiroz.vehicles.interfaces.impl;

import br.com.goqueiroz.vehicles.interfaces.IVehicle;

public class Bike implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("A comida ja foi retirada!");
    }
}
