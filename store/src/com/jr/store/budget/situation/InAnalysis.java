package com.jr.store.budget.situation;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class InAnalysis extends BudgetSituation {
    @Override
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return budget.getPrice().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget) {
        budget.setSituation(new Approve());
    }

    @Override
    public void fail(Budget budget) {
        budget.setSituation(new Fail());
    }
}
