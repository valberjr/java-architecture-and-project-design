package com.jr.store.order;

import com.jr.store.budget.Budget;

import java.time.LocalDateTime;
import java.util.List;

public class GeneratorOrderHandler {

    private List<ActionBeforeGenerateOrder> actions;

    public GeneratorOrderHandler(List<ActionBeforeGenerateOrder> actions) {
        this.actions = actions;
    }

    public void execute(GeneratorOrder data) {
        Budget budget = new Budget(data.getBudgetPrice(), data.getItemsQuantity());
        Order order = new Order(data.getClient(), LocalDateTime.now(), budget);

        actions.forEach(action -> action.executeAction(order));
    }
}
