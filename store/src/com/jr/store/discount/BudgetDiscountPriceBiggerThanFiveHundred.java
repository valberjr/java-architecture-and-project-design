package com.jr.store.discount;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountPriceBiggerThanFiveHundred extends Discount {
    public BudgetDiscountPriceBiggerThanFiveHundred(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return budget.getPrice().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getPrice().compareTo(new BigDecimal("500")) > 0;
    }
}