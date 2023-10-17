package org.example;

public class Calc {

    public static String sum(String a, String b) {

        String result = "";
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        result = String.valueOf(intA + intB);

        return result;
    }
}
