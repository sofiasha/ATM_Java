package org.example;

import org.springframework.stereotype.Component;

@Component
public class ATMManager {

    private long balance;

    public long available(){
        return Double.valueOf(balance*0.2).longValue();

    }

    public void withdraw(long amount) {

        System.out.println("Баланс: " + balance);
        System.out.println("Вы хотите снять: " + amount);

        double availableDouble = balance*0.2;

        if(amount <= availableDouble && amount >= 1) {
            balance -= amount;
            System.out.println("Баланс после снятия: " + balance);
        }
    }

    public void deposit(long amount){

        if(amount >= 1) {
            balance += amount;
        }
        System.out.println("Баланс после внесения " + balance);
    }

}
