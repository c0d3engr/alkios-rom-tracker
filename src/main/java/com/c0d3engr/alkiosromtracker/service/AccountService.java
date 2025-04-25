package com.c0d3engr.alkiosromtracker.service;

import com.example.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    Account createAccount(Account account);
    Account updateAccount(Long id, Account account);
    void deleteAccount(Long id);
}