package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessPatternTest {
    ChessPattern chessPattern;
    @Before
    public void setUp() throws Exception {
        chessPattern=new ChessPattern();
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void checkPattern() {
        String expected[][]={{"BB","BB","BB","BB","BB","BB","BB","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

        String [][] actual = chessPattern.chess(8, 8);

        assertNotEquals("Following is chessPattern output",expected,actual);
    }

    @Test
    public void checkPatternSuccess() {
    String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};
        String [][] actual = chessPattern.chess(8, 8);

        assertArrayEquals("Following is chessPattern  output",expected,actual);
    }
    }