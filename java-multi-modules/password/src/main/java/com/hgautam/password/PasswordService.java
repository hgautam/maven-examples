package com.hgautam.password;

public interface PasswordService {

    String hash(String input);

    String algorithm();

}