package com.jr.store.order.action;

import com.jr.store.order.ActionBeforeGenerateOrder;
import com.jr.store.order.Order;

public class SendEmailOrder implements ActionBeforeGenerateOrder {
    @Override
    public void executeAction(Order order) {
        System.out.println("Sending email with order data");
    }
}
