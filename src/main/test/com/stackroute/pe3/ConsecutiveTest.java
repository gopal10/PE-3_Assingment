package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTest {

    Consecutive consecutive;
    @Before
    public void setUp() throws Exception {
        consecutive=new Consecutive();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkconsecutiveSuccess1() {
        assertEquals(false,consecutive.checkconsecutive("98,96,95,94,93,91,89"));
        assertNotNull(consecutive.checkconsecutive("98,96,95,94,93,91,89"));
    }
    @Test
    public void checkconsecutiveSuccess2() {
        assertEquals(false,consecutive.checkconsecutive("97,96,92,91,97,98,99"));
        assertNotNull(consecutive.checkconsecutive("97,96,92,91,97,98,99"));
    }

    @Test
    public void checkconsecutiveFailure() {
        assertNotEquals(true,consecutive.checkconsecutive("98,96,95,94,93,91,89"));
        assertNotNull(consecutive.checkconsecutive("98,96,95,94,93,91,89"));
    }

}