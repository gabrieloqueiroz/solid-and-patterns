package br.com.goqueiroz.abstractfactory;

import br.com.goqueiroz.abstractfactory.App.Application;
import br.com.goqueiroz.abstractfactory.Factories.ITransportFactory;
import br.com.goqueiroz.abstractfactory.Factories.NineNineTransport;
import br.com.goqueiroz.abstractfactory.Factories.UberTransport;

public class Main {

  public static Application configApp() {
    ITransportFactory factory;

    String company = "uber";

    if (company.equals("uber")){
      factory = new UberTransport();
    } else {
      factory = new NineNineTransport();
    }

    return new Application(factory);
  }


  public static void main(String[] args) {
    configApp().startRoute();
  }
}