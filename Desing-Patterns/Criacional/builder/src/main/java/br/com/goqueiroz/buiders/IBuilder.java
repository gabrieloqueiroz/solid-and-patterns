package br.com.goqueiroz.buiders;

import br.com.goqueiroz.components.CarType;
import br.com.goqueiroz.components.Engine;
import br.com.goqueiroz.components.Transmission;

public interface IBuilder {
    void setEngine(Engine engine);
    void setSeats(int seats);
    void setCarType(CarType carType);
    void setTransmission(Transmission transmission);
}
