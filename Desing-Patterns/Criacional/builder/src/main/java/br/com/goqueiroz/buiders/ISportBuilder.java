package br.com.goqueiroz.buiders;

import br.com.goqueiroz.components.Brands;
import br.com.goqueiroz.components.Colors;

public interface ISportBuilder extends IBuilder{
    void setColor(Colors color);
    void setBrand(Brands brand);
}
