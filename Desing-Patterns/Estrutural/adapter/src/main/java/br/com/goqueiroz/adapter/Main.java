package br.com.goqueiroz.adapter;

import br.com.goqueiroz.adapter.adapters.MercadoPagoAdapter;
import br.com.goqueiroz.adapter.mercadoPago.MercadoPagoPayments;
import br.com.goqueiroz.adapter.paypal.IPayPalPayments;

public class Main {
    public static void main(String[] args) {
        IPayPalPayments payPalPayments = new MercadoPagoAdapter(new MercadoPagoPayments());
        payPalPayments.paypalPayment();
        payPalPayments.paypalReceive();

        System.out.println();

//        IPayoneerPayments payoneerPayments = new Payonner();
//        payoneerPayments.sendPayment();
//        payoneerPayments.receivePayment();

//        IMercadoPagoPayments mercadoPagoPayments = new MercadoPagoPayments();
//        mercadoPagoPayments.sendAuthorization();
//        mercadoPagoPayments.receiveAuthorization();

    }
}