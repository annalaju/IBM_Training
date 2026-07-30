package com.bank;
import org.springframework.stereotype.Component;

@Component("debitCard")
public class DebitCardPaymentService implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Payment done using Debit Card");
    }
}