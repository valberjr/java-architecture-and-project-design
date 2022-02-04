package com.jr.store.main;

import com.jr.store.budget.Budget;
import com.jr.store.tax.TaxCalculator;
import com.jr.store.tax.TaxType;

import java.math.BigDecimal;

public class TaxTestMain {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));

        TaxCalculator calculator = new TaxCalculator();
        System.out.println(calculator.calculate(budget, TaxType.ISS));
    }
}
