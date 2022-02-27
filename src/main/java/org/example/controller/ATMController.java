package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.ATMManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor //  генерирует конструктор для всех полей класса
public class ATMController {
    private ATMManager atmManager;

    @RequestMapping("/available")
    public long available() {
        return atmManager.available();
    }

    @RequestMapping("/withdraw")
    public void withdraw(long amount) {
        atmManager.withdraw(amount);
    }

    @RequestMapping("/deposit")
    public void deposit(long amount){

        atmManager.deposit(amount);
    }
}
