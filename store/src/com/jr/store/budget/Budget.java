package com.jr.store.budget;

import com.jr.store.budget.situation.BudgetSituation;
import com.jr.store.budget.situation.InAnalysis;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal price;
    private int itemsQuantity;
    private BudgetSituation situation;

    public Budget(BigDecimal price, int itemsQuantity) {
        this.price = price;
        this.itemsQuantity = itemsQuantity;
        this.situation = new InAnalysis();
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscountPrince = this.situation.calculateExtraDiscount(this);
        this.price.subtract(extraDiscountPrince);
    }

    public void approve() {
        this.situation.approve(this);
    }

    public void fail() {
        this.situation.fail(this);
    }

    public void finish() {
        this.situation.finish(this);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public BudgetSituation getSituation() {
        return situation;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }
}
