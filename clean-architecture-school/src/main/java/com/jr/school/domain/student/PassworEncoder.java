package com.jr.school.domain.student;

public interface PassworEncoder {

    String encode(String password);

    boolean validateEncodedPassword(String encodedPassword, String password);
}
