package br.com.goqueiroz.adapter.payoneer;

import br.com.goqueiroz.adapter.utils.Token;

public interface IPayoneerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();

}
