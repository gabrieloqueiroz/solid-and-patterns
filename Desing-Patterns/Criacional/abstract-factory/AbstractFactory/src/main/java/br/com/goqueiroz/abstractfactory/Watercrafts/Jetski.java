package br.com.goqueiroz.abstractfactory.Watercrafts;

public class Jetski implements IWatercrafts{

  @Override
  public void startRoute() {
    waves();
    getCargo();
    System.out.println("Entrega pelo mar iniciada!");
  }

  @Override
  public void getCargo() {
    System.out.println("Produtos coletados, ok");
  }

  @Override
  public void waves() {
    System.out.println("Analise para as ondas, ondas Ok!");
  }
}
