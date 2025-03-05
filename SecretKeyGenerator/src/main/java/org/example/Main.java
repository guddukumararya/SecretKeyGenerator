package org.example;

import io.jsonwebtoken.Jwts;

import javax.crypto.SecretKey;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        SecretKey key = Jwts.SIG.HS256.key().build();
        String encodedKey = Base64.getEncoder().encodeToString(key.getEncoded());
        System.out.println("Generated Secret key : "+encodedKey);
    }
}