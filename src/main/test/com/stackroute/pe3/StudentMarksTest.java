package com.stackroute.pe3;

import com.stackroute.pe3.StudentMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks studentMarks;
    @Before
    public void setUp() throws Exception {
        studentMarks= new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String expected="Error";
        int array[]={62,23,434};
        String actual = studentMarks.check(array, 3);

        assertEquals("Following is of studentmarks class",expected,actual);
    }
    @Test
    public void checksuccess() {
        String expected="All marks are correct";
        int array[]={62,23,4};
        String actual = studentMarks.check(array, 3);

        assertEquals("Following is of studentmarks class",expected,actual);
    }
}