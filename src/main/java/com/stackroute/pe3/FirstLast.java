package com.stackroute.pe3;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstLast {
    public  String check()
    {
        Date d= new Date();
        SimpleDateFormat simple = new SimpleDateFormat("EEE dd/MM/yyyy");

       String firsday= simple.format(d);

        return firsday;

    }



    public  String checklast()
    {

        SimpleDateFormat simple = new SimpleDateFormat("EEE dd/MM/yyyy");



        Calendar c = Calendar.getInstance();


        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        SimpleDateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");

            c.add(Calendar.DATE, 6);

         String lastday = df.format(c.getTime());

        return lastday;

    }
}
