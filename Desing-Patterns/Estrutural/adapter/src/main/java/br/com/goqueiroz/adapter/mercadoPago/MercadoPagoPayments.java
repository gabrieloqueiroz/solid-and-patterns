package br.com.goqueiroz.adapter.mercadoPago;

import br.com.goqueiroz.adapter.utils.Token;

public class MercadoPagoPayments implements IMercadoPagoPayments {
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendAuthorization() {
        this.token = this.authToken();
        System.out.println("Enviando pagamento via Mercado Pago: " + this.token.getAuthToken());
    }

    @Override
    public void receiveAuthorization() {
        System.out.println("Recebendo pagamento via Mercado Pago");
    }
}
