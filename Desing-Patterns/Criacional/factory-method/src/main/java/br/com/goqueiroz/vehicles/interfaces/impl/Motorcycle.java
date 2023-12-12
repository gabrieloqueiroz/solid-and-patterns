package br.com.goqueiroz.vehicles.interfaces.impl;

import br.com.goqueiroz.vehicles.interfaces.IVehicle;

public class Motorcycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega!");
    }

    @Override
    public void getCargo() {
        System.out.println("Encomenda coletada!");
    }
}
