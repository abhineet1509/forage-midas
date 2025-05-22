package com.jpmc.midascore.dto;

import java.math.BigDecimal;

public class Transaction {
    private String id;
    private BigDecimal amount;

    // getters & setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    @Override
    public String toString() {
        return "Transaction{id='" + id + "', amount=" + amount + '}';
    }
}
