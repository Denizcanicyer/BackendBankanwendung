package com.BackendBank.BackendBank;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Transaction> getTransactionById(@PathVariable Long id) {
        return transactionRepository.findAllById(id);
    }
    @GetMapping("/category/{category}")
    public List<Transaction> getTransactionByCategory(@PathVariable String category) {

        return transactionRepository.findByCategory(category);
    }
    @GetMapping("/amount/{id}")
    @Query()
    public Optional<Transaction> getAllamount(@PathVariable Long id) {
        return transactionRepository.findAllById(id);
    }


    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }
    @PutMapping("/update")
    public Transaction updateTransaction(@RequestBody Transaction transaction) {

        return transactionRepository.save(transaction);
    }

    @DeleteMapping("/{id}")
    public void deleteTransactionByID(@PathVariable Long id) {
        transactionRepository.deleteById(id);
    }

    @DeleteMapping()
    public void deleteTransaction() {
        transactionRepository.deleteAll();
    }
}