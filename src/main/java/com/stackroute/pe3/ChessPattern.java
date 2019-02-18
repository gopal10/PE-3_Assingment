package com.stackroute.pe3;

public class ChessPattern {

    public String [][]  chess(int rows,int cols)
    {
        String output[][]= new String[rows][cols];
     for (int i=0; i<rows; i++)
     {
         for (int j=0; j<rows; j++)
         {
              if((i%2)==(j%2))
              {
                  output[i][j]="WW";
              }
              else
              {
                  output[i][j]="BB";
              }

         }

     }

     return output;
    }
}
