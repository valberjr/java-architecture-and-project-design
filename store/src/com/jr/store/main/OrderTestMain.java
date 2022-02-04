package com.jr.store.main;

import com.jr.store.order.GeneratorOrder;
import com.jr.store.order.GeneratorOrderHandler;
import com.jr.store.order.action.SaveOrderInDatabase;
import com.jr.store.order.action.SendEmailOrder;

import java.math.BigDecimal;
import java.util.Arrays;

public class OrderTestMain {
    public static void main(String[] args) {
        String client = "Jess";
        BigDecimal budgetPrice = new BigDecimal("300");
        int itemsQuantity = Integer.parseInt("2");

        GeneratorOrder generator = new GeneratorOrder(client, budgetPrice, itemsQuantity);

        GeneratorOrderHandler handler = new GeneratorOrderHandler(
                Arrays.asList(new SaveOrderInDatabase(),
                        new SendEmailOrder()));
        handler.execute(generator);
    }
}
