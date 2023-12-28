package br.com.goqueiroz.abstractfactory.LandVehicles;

public class Car implements ILandVehicles{

  @Override
  public void startRoute() {
    getCargo();
    System.out.println("Iniciando trajeto, tudo ok!");
  }

  @Override
  public void getCargo() {
    System.out.println("Passgeiros acomodados!");
  }
}
