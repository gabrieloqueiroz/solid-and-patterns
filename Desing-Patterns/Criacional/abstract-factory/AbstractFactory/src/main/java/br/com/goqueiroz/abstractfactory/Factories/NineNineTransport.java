package br.com.goqueiroz.abstractfactory.Factories;

import br.com.goqueiroz.abstractfactory.Aircrafts.Helicopter;
import br.com.goqueiroz.abstractfactory.Aircrafts.IAircraft;
import br.com.goqueiroz.abstractfactory.LandVehicles.ILandVehicles;
import br.com.goqueiroz.abstractfactory.LandVehicles.MotorCycle;
import br.com.goqueiroz.abstractfactory.Watercrafts.IWatercrafts;
import br.com.goqueiroz.abstractfactory.Watercrafts.Jetski;

public class NineNineTransport implements ITransportFactory{

  @Override
  public ILandVehicles createVehiclesTransport() {
    return new MotorCycle();
  }

  @Override
  public IAircraft createAircraftTransport() {
    return new Helicopter();
  }

  @Override
  public IWatercrafts createWatercraftTransport() {
    return new Jetski();
  }
}
