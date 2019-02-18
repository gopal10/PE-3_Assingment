package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {

    RemoveVowel removeVowel;
    @Before
    public void setUp() throws Exception {
        removeVowel= new RemoveVowel();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String expected="Ind\n" +
                "Untd Stts\n" +
                "Grmny\n" +
                "Egypt\n" +
                "czchslvk\n";
        String array[]={"India",
                "United States",
                "Germany",
                "Egypt",
                "czechoslovakia"};
        String actual = removeVowel.removevowels(array);

        assertEquals("Following is of RemoveVowelTest class",expected,actual);
    }

}