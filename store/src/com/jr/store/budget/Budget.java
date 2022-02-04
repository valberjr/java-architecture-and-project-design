package com.jr.store.budget;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal price;
    private int itemsQuantity;

    public Budget(BigDecimal price, int itemsQuantity) {
        this.price = price;
        this.itemsQuantity = itemsQuantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }
}
