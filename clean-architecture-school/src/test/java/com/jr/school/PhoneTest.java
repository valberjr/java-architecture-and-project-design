package com.jr.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PhoneTest {

    @Test
    public void shouldNotCreatePhoneWithInvalidAreasCode() {
        assertThrows(IllegalArgumentException.class, () -> new Phone(null, "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Phone("", "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Phone("1", "123456789"));
    }

    @Test
    public void shouldNotCreatePhoneWithInvalidANumber() {
        assertThrows(IllegalArgumentException.class, () -> new Phone("11", null));
        assertThrows(IllegalArgumentException.class, () -> new Phone("11", ""));
        assertThrows(IllegalArgumentException.class, () -> new Phone("11", "123"));
    }

    @Test
    public void shouldAllowCreatePhoneWithValidAreaCodeAndNumber() {
        String areaCode = "11";
        String number = "123456789";

        Phone phone = new Phone(areaCode, number);

        assertEquals(areaCode, phone.getAreaCode());
        assertEquals(number, phone.getNumber());
    }

}