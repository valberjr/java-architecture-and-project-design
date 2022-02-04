package com.jr.store.discount;

import com.jr.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        Discount discountChains = new BudgetDiscountBiggerThanFiveItems(
                new BudgetDiscountPriceBiggerThanFiveHundred(
                        new NoDiscount()));

        return discountChains.calculate(budget);
    }
}
