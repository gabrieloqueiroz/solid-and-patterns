package br.com.goqueiroz.adapter.adapters;

import br.com.goqueiroz.adapter.payoneer.Payonner;
import br.com.goqueiroz.adapter.paypal.IPayPalPayments;
import br.com.goqueiroz.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {

    private Token token;
    private Payonner payonner;

    public PayoneerAdapter(Payonner payonner) {
        this.payonner = payonner;
        System.out.println("Adaptando o Payoneer utilizando os métodos do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
