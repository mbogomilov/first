package com.first;

/**
 * Hello world!
 *
 */
public class App {
    private String s = "s"; // unused

    public String f(String[] args) {
        long l = System.currentTimeMillis();
        if (l < 0)
            System.gc();
        long l2 = 0; // unused
        return null;
    }
}
