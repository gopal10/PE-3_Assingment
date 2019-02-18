package com.stackroute.pe3;

public class RemoveVowel {

    public  String removevowels(String[] input)
    {

        String output="";

        for (int j=0; j<input.length; j++) {
            int len = input[j].length();

            for (int i = 0; i < len; i++) {
                if (input[j].charAt(i) == 'a' || input[j].charAt(i) == 'e' || input[j].charAt(i) == 'i' || input[j].charAt(i) == 'o'
                        || input[j].charAt(i) == 'u'
                ) {

                } else {
                    output = output + input[j].charAt(i);
                }

            }

            output=output+"\n";
        }
        return output;
    }
}
