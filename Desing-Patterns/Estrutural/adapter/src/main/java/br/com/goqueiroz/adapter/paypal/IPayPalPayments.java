package br.com.goqueiroz.adapter.paypal;

import br.com.goqueiroz.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
