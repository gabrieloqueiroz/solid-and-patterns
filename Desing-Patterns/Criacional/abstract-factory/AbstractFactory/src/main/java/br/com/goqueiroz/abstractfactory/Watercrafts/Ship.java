package br.com.goqueiroz.abstractfactory.Watercrafts;

public class Ship  implements IWatercrafts{

  @Override
  public void startRoute() {
    waves();
    getCargo();
    System.out.println("Iniciando trajeto do Navio!");
  }

  @Override
  public void getCargo() {
    System.out.println("Passageiros embarcados");
  }

  @Override
  public void waves() {
    System.out.println("As ondas foram checadas, ondas ok!");
  }
}
