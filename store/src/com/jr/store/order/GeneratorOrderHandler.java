package com.jr.store.order;

import com.jr.store.budget.Budget;

import java.time.LocalDateTime;

public class GeneratorOrderHandler {

    // constructor: dependency injection (services, repositories, ...)

    public void execute(GeneratorOrder data) {
        Budget budget = new Budget(data.getBudgetPrice(), data.getItemsQuantity());
        Order order = new Order(data.getClient(), LocalDateTime.now(), budget);

        System.out.println("Save order on database");
        System.out.println("Send email with order data");
    }
}
