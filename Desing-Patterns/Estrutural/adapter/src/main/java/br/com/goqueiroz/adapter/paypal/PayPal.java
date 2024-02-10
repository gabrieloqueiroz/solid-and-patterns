package br.com.goqueiroz.adapter.paypal;

import br.com.goqueiroz.adapter.utils.Token;

public class PayPal implements IPayPalPayments{

    private Token authToken;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.authToken = this.authToken();
        System.out.println("Enviando pagamento via PayPal: " + this.authToken.getAuthToken());
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamento via PayPal");
    }
}
