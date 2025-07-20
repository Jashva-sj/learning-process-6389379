package com.example.loan.controller;

import com.example.loan.model.Loan;
import com.example.loan.repository.LoanRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanRepository repository;
    private final RestTemplate restTemplate;

    public LoanController(LoanRepository repository, RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public String applyLoan(@RequestBody Loan loan) {
        // Verify account exists
        String accountServiceUrl = "http://localhost:8080/accounts/" + loan.getAccountId();
        Optional<?> account = Optional.ofNullable(
                restTemplate.getForObject(accountServiceUrl, Object.class)
        );

        if (account.isPresent()) {
            repository.save(loan);
            return "Loan approved for account " + loan.getAccountId();
        } else {
            return "Invalid account ID. Loan rejected.";
        }
    }

    @GetMapping("/{id}")
    public Optional<Loan> getLoan(@PathVariable Long id) {
        return repository.findById(id);
    }
}
