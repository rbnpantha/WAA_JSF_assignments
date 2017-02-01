package com.corejsf.controller;

import java.util.ArrayList;
import java.util.List;

public class Register {

    private static List<LoginBean> registeredUser = new ArrayList<>();

    static {
        registeredUser.add(new LoginBean("rabin", "985432"));
    }

    public static void register(String name, String password) {
        registeredUser.add(new LoginBean(name, password));
    }

    public static boolean isRegistered(String name, String password) {

        return registeredUser.stream().anyMatch((user) -> (user.getName().equals(name) && user.getPassword().equals(password)));
    }
}