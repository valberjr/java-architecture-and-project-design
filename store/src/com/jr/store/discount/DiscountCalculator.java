package com.jr.store.discount;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calulate(Budget budget) {
        if (budget.getItemsQuantity() > 5) {
            return budget.getPrice().multiply(new BigDecimal("0.1"));
        }

        if (budget.getPrice().compareTo(new BigDecimal("500")) > 0) {
            return budget.getPrice().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}
