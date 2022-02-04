package com.jr.store.budget.situation;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class Approve extends BudgetSituation {
    @Override
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return budget.getPrice().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finish());
    }
}
