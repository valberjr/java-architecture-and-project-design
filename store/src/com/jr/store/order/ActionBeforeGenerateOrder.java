package com.jr.store.order;

public interface ActionBeforeGenerateOrder {
    void executeAction(Order order);
}
