package com.jr.store.order;

import java.math.BigDecimal;

public class GeneratorOrder {
    private String client;
    private BigDecimal budgetPrice;
    private int itemsQuantity;

    public GeneratorOrder(String client, BigDecimal budgetPrice, int itemsQuantity) {
        this.client = client;
        this.budgetPrice = budgetPrice;
        this.itemsQuantity = itemsQuantity;
    }

    public String getClient() {
        return client;
    }

    public BigDecimal getBudgetPrice() {
        return budgetPrice;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }
}
