package com.jr.store.discount;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountBiggerThanFiveItems extends Discount {

    public BudgetDiscountBiggerThanFiveItems(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return budget.getPrice().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getItemsQuantity() > 5;
    }
}