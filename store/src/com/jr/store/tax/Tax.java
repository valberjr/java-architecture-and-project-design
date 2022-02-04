package com.jr.store.tax;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Budget budget);
}
