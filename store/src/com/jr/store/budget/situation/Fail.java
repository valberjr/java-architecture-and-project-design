package com.jr.store.budget.situation;

import com.jr.store.budget.Budget;

public class Fail extends BudgetSituation {
    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finish());
    }
}
