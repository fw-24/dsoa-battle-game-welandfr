package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java version: " + System.getProperty("java.version"));

        System.out.println("random: " + (new Random()).nextInt(10,20));

    }
}
