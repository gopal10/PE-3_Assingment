package com.stackroute.pe3;

public class AdditionOfMatrix {

    public  int [][] addMatrix(int rows, int columns, int Array1[][], int Array2[][])
    {
        int sum[][]= new int[rows][columns];

        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++ )
            {
               sum[i][j]=Array1[i][j]+Array2[i][j];
            }
        }
        return sum;
    }
}
