package com.hm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String password = "123";
        String s = encodePassword(password);
        //$2a$10$KKSZvdh.nSdVuDpXiGVtl.1AsuqJWqZT6wy2.JoyFutbu6EYEtMQy
        System.out.println(s);
    }
}
