package com.vent.bank.bankingapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/myLoans")
    public String getLoanDetails() {
        return "Here are the account details from the DB";
    }
}
