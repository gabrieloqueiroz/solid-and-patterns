package br.com.goqueiroz.adapter.mercadoPago;

import br.com.goqueiroz.adapter.utils.Token;

public interface IMercadoPagoPayments {
    Token authToken();
    void sendAuthorization();
    void receiveAuthorization();
}
