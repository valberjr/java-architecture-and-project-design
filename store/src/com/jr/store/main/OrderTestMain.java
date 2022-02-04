package com.jr.store.main;

import com.jr.store.order.GeneratorOrder;
import com.jr.store.order.GeneratorOrderHandler;

import java.math.BigDecimal;

public class OrderTestMain {
    public static void main(String[] args) {
        String client = args[0];
        BigDecimal budgetPrice = new BigDecimal(args[1]);
        int itemsQuantity = Integer.parseInt(args[2]);

        GeneratorOrder generator = new GeneratorOrder(client, budgetPrice, itemsQuantity);

        GeneratorOrderHandler handler = new GeneratorOrderHandler(/*dependencies*/);
        handler.execute(generator);
    }
}
