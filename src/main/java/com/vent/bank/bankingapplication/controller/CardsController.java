package com.vent.bank.bankingapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping("/myCards")
    public String getCardDetails() {
        return "Here are the account details from the DB";
    }
}
