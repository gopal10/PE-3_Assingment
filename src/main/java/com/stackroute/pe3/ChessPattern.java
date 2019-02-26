package com.stackroute.pe3;
//Write a program to create a ChessBoard pattern with the help of multidimensional array, where WWrepresents white color and BB represents Black color. Output: My Chess Board WW|BB|WW|BB|WW|BB|WW|BB| BB|WW|BB|WW|BB|WW|BB|WW| WW|BB|WW|BB|WW|BB|WW|BB| BB|WW|BB|WW|BB|WW|BB|WW| WW|BB|WW|BB|WW|BB|WW|BB| BB|WW|BB|WW|BB|WW|BB|WW| WW|BB|WW|BB|WW|BB|WW|BB| BB|WW|BB|WW|BB|WW|BB|WW|
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
