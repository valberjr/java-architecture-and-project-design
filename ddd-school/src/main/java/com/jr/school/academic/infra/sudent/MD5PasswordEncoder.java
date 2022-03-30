package com.jr.school.academic.infra.sudent;

import com.jr.school.academic.domain.student.PassworEncoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5PasswordEncoder implements PassworEncoder {
    @Override
    public String encode(String password) {
        try {
            var md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());

            var bytes = md.digest();
            var sb = new StringBuilder();

            for (var i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Password generator error");
        }
    }

    @Override
    public boolean validateEncodedPassword(String encodedPassword, String password) {
        return encodedPassword.equals(encode(password));
    }
}
