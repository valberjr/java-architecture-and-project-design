package com.jr.store.discount;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountPriceBiggerThanFiveHundred extends Discount {
    public BudgetDiscountPriceBiggerThanFiveHundred(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getPrice().compareTo(new BigDecimal("500")) > 0) {
            return budget.getPrice().multiply(new BigDecimal("0.05"));
        }
        return next.calculate(budget);
    }
}