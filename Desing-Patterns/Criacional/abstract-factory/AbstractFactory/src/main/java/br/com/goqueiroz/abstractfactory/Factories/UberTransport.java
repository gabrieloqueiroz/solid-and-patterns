package br.com.goqueiroz.abstractfactory.Factories;

import br.com.goqueiroz.abstractfactory.Aircrafts.Airplane;
import br.com.goqueiroz.abstractfactory.Aircrafts.IAircraft;
import br.com.goqueiroz.abstractfactory.LandVehicles.Car;
import br.com.goqueiroz.abstractfactory.LandVehicles.ILandVehicles;
import br.com.goqueiroz.abstractfactory.Watercrafts.IWatercrafts;
import br.com.goqueiroz.abstractfactory.Watercrafts.Ship;

public class UberTransport implements ITransportFactory{

  @Override
  public ILandVehicles createVehiclesTransport() {
    return new Car();
  }

  @Override
  public IAircraft createAircraftTransport() {
    return new Airplane();
  }

  @Override
  public IWatercrafts createWatercraftTransport() {
    return new Ship();
  }

}
