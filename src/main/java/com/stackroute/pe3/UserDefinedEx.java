package com.stackroute.pe3;



public class UserDefinedEx {

    public static void  main(String [] gopal)
    {
        try {
            throw new UserException();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
