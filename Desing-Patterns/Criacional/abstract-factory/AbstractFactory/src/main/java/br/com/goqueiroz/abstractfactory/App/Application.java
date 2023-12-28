package br.com.goqueiroz.abstractfactory.App;

import br.com.goqueiroz.abstractfactory.Aircrafts.IAircraft;
import br.com.goqueiroz.abstractfactory.Factories.ITransportFactory;
import br.com.goqueiroz.abstractfactory.LandVehicles.ILandVehicles;
import br.com.goqueiroz.abstractfactory.Watercrafts.IWatercrafts;

public class Application {

  private ILandVehicles vehicles;
  private IAircraft aircraft;
  private IWatercrafts watercrafts;

  public Application(ITransportFactory transportFactory) {
    this.vehicles = transportFactory.createVehiclesTransport();
    this.aircraft = transportFactory.createAircraftTransport();
    this.watercrafts = transportFactory.createWatercraftTransport();
  }

  public void startRoute(){
    vehicles.startRoute();
    aircraft.startRoute();
    watercrafts.startRoute();
  }
}
