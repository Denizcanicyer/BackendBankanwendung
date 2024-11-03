package com.BackendBank.BackendBank;



import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCategory(String category);
    Optional<Transaction> findAllById(Long id);
}