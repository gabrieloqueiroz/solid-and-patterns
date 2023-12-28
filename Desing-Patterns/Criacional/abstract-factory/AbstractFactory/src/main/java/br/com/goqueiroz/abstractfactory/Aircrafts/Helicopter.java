package br.com.goqueiroz.abstractfactory.Aircrafts;

public class Helicopter implements IAircraft{

  @Override
  public void startRoute() {
    wind();
    getCargo();
    System.out.println("Ligando hélices, tudo ok!");
  }

  @Override
  public void getCargo() {
    System.out.println("Coletado, tudo ok!");
  }

  @Override
  public void wind() {
    System.out.println("Ventos a 30km/h, ventos ok!");
  }
}
