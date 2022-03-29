package com.jr.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFTest {

    @Test
    void shouldNotCreateCPFWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("12345678900"));
    }

    @Test
    void shouldAllowCreateCPFWithValidNumber() {
        String number = "123.456.789-00";
        CPF cpf = new CPF(number);

        assertEquals(number, cpf.getNumber());
    }

}