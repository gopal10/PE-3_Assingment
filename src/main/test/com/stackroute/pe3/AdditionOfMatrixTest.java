package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatrixTest {

    AdditionOfMatrix additionOfMatrix;
    @Before
    public void setUp() throws Exception {
        additionOfMatrix=new AdditionOfMatrix();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        int expected[][]={{10,10,10},{10,10,10}};

        int array1[][]={{1,3,9},{9,7,1}};

        int array2[][]={{9,7,1},{1,3,9}};
        int [][] actual = additionOfMatrix.addMatrix(2, 3, array1, array2);

        assertArrayEquals("Following is of addition matrix class",expected,actual);
    }

    @Test
    public void check2() {
        int expected[][]={{10,10,10},{10,10,10}};

        int array1[][]={{1,2,3},{4,7,1}};

        int array2[][]={{9,8,7},{6,3,9}};
        int [][] actual = additionOfMatrix.addMatrix(2, 3, array1, array2);

        assertArrayEquals("Following is addition matrix output",expected,actual);
    }
}