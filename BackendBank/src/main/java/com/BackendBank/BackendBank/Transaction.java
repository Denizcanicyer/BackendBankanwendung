package com.BackendBank.BackendBank;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Data
@Table(name="TRANSACTIONS")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private long id;
    @Column(name= "TYPE")
    private String type; //
    @Column(name= "AMOUNT")
    private double amount;
    @Column(name= "CATEGORY")
    private String category;


    public Transaction() {
    }

    public Transaction(long id, String type, double amount, String category) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.category = category;

    }
}
