package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLastTest {

    FirstLast firstLast;
    @Before
    public void setUp() throws Exception {
        firstLast= new FirstLast();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String expected="Mon 18/02/2019";

        String actual = firstLast.check();

        assertEquals("Following is  FirstLast result",expected,actual);
    }

    @Test
    public void checklast() {
        String expected="Sun 24/02/2019";

        String actual = firstLast.checklast();

        assertEquals("Following is  FirstLast result",expected,actual);
    }

}