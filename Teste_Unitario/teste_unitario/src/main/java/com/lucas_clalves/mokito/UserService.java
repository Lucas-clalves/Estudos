package com.lucas_clalves.mokito;

public class UserService {

    public boolean isUserMinor(int idade) {
        if (idade < 18) {
            return true;
        }
        return false;
    }

}
