package com.bank;
import org.springframework.stereotype.Component;

@Component("creditCard")
public class CreditCardPaymentService implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}