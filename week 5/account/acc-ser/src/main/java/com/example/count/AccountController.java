package com.example.account.controller;

import com.example.account.model.Account;
import com.example.account.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountRepository repository;

    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return repository.save(account);
    }

    @GetMapping("/{id}")
    public Optional<Account> getAccount(@PathVariable Long id) {
        return repository.findById(id);
    }
}
