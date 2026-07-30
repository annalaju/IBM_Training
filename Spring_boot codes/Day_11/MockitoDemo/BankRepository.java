package com.example.MockitoDemo;
public interface BankRepository {
   BankAccount findByAccountNumber(String accountNumber);
   void save(BankAccount account);
}
