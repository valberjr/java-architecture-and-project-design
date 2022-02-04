package com.jr.store.tax;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class ISS implements Tax {

    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getPrice().multiply(new BigDecimal("0.06"));
    }
}
