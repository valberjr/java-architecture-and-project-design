package com.jr.store.budget.situation;

import com.jr.store.DomainException;
import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetSituation {
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget) {
        throw new DomainException("The budget can't be approved");
    }

    public void fail(Budget budget) {
        throw new DomainException("The budget can't be failed");
    }

    public void finish(Budget budget) {
        throw new DomainException("The budget can't be finished");
    }
}
