package br.com.goqueiroz.adapter.adapters;

import br.com.goqueiroz.adapter.mercadoPago.MercadoPagoPayments;
import br.com.goqueiroz.adapter.paypal.IPayPalPayments;
import br.com.goqueiroz.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {

    private Token token;
    private MercadoPagoPayments mercadoPagoPayments;

    public MercadoPagoAdapter(MercadoPagoPayments mercadoPagoPayments){
        this.mercadoPagoPayments = mercadoPagoPayments;
        System.out.println("Adaptando o Mercado Pago utilizando os métodos do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPagoPayments.sendAuthorization();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPagoPayments.receiveAuthorization();
    }
}
