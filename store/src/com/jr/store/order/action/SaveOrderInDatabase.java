package com.jr.store.order.action;

import com.jr.store.order.ActionBeforeGenerateOrder;
import com.jr.store.order.Order;

public class SaveOrderInDatabase implements ActionBeforeGenerateOrder {
    @Override
    public void executeAction(Order order) {
        System.out.println("Saving order in database");
    }
}
