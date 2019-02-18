package com.stackroute.pe3;

public class ExceptionClass {

    public static  void main(String gopal[])
    {

        try {
            int newArray[]= new int[-5];


        } catch (NegativeArraySizeException p)
        {
            p.printStackTrace();

        }
        finally
        {
            second();


        }

    }
    public  static void second()
    {
        int array[]= new int[4];
        try {
            System.out.println(array[6]);
            System.out.println(array[-1]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
    }
}
