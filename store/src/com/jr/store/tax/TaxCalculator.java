package com.jr.store.tax;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calculate(Budget budget, TaxType taxType) {
        switch (taxType) {
            case ICMS:
                return budget.getPrice().multiply(new BigDecimal("0.1"));
            case ISS:
                return budget.getPrice().multiply(new BigDecimal("0.06"));
            default:
                return BigDecimal.ZERO;
        }
    }
}
