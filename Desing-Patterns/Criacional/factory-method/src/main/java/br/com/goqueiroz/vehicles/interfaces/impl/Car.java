package br.com.goqueiroz.vehicles.interfaces.impl;

import br.com.goqueiroz.vehicles.interfaces.IVehicle;

public class Car implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto!");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros embarcados, estamos prontos!");
    }
}
