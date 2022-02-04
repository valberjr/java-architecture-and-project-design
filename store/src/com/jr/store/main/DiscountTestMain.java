package com.jr.store.main;

import com.jr.store.budget.Budget;
import com.jr.store.discount.DiscountCalculator;

import java.math.BigDecimal;

public class DiscountTestMain {
    public static void main(String[] args) {
        Budget budget1 = new Budget(new BigDecimal("200"), 6);
        Budget budget2 = new Budget(new BigDecimal("1000"), 1);

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(budget1));
        System.out.println(calculator.calculate(budget2));
    }
}
