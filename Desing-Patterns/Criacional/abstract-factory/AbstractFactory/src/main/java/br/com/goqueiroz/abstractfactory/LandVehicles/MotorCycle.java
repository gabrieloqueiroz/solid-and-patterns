package br.com.goqueiroz.abstractfactory.LandVehicles;

public class MotorCycle implements ILandVehicles{

  @Override
  public void startRoute() {
    getCargo();
    System.out.println("Iniciando circuito de entrega!");
  }

  @Override
  public void getCargo() {
    System.out.println("Pedido coletado, tudo ok!");
  }
}
