package com.jr.store.discount;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount() {
        super(null);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return true;
    }
}
