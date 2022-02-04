package com.jr.store.discount;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountBiggerThanFiveItems extends Discount {

    public BudgetDiscountBiggerThanFiveItems(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getItemsQuantity() > 5) {
            return budget.getPrice().multiply(new BigDecimal("0.1"));
        }
        return next.calculate(budget);
    }
}