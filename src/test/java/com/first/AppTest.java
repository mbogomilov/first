package com.first;

import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp() {
        assertNull(new App().f(null));
    }
}
