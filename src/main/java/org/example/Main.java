package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java version: " + System.getProperty("java.version"));

        // Funkar INTE i GitHub Classroom:
        System.out.println((new Random()).nextInt(10,20));

        // FUNKAR  i GitHub Classroom:
        System.out.println((new Random()).nextInt(10) + 10);

    }
}
