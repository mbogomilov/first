package com.first;

/**
 * Hello world!
 *
 */
public class App {
    public String f(String[] args) {
        long l = System.currentTimeMillis();
        if (l < 0)
            System.gc();
        return null;
    }
}
