package br.com.goqueiroz.adapter.payoneer;

import br.com.goqueiroz.adapter.utils.Token;

public class Payonner implements IPayoneerPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        this.token = this.authToken();
        System.out.println("Enviando pagamento via Payoneer: " + this.token.getAuthToken());
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamento via Payoneer");
    }
}
