package com.jr.store.discount;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        if (shouldApply(budget)) {
            return performCalculation(budget);
        }
        return next.calculate(budget);
    }

    protected abstract BigDecimal performCalculation(Budget budget);

    protected abstract boolean shouldApply(Budget budget);
}