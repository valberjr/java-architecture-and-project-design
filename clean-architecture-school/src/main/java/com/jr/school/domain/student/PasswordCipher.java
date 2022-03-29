package com.jr.school.domain.student;

public interface PasswordCipher {

    String encode(String password);

    boolean validateEncodedPassword(String encodedPassword, String password);
}
