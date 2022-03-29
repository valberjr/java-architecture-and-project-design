package com.jr.school;

public class Phone {

    private String areaCode;
    private String number;

    public Phone(String areaCode, String number) {
        if (areaCode == null || number == null) {
            throw new IllegalArgumentException("Area Code and Number Required");
        }

        if (!areaCode.matches("\\d{2}")) {
            throw new IllegalArgumentException("Invalid Area Code");
        }

        if (!number.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Invalid Number");
        }

        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }
}
