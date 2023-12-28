package br.com.goqueiroz.abstractfactory.Factories;

import br.com.goqueiroz.abstractfactory.Aircrafts.IAircraft;
import br.com.goqueiroz.abstractfactory.LandVehicles.ILandVehicles;
import br.com.goqueiroz.abstractfactory.Watercrafts.IWatercrafts;

public interface ITransportFactory {
  ILandVehicles createVehiclesTransport();
  IAircraft createAircraftTransport();

  IWatercrafts createWatercraftTransport();
}
