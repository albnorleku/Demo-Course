package com.javaCourse.helloWorld;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OtherJavaExamples {
    public static void main(String[] args) {
        int a = 3;
        double result = Math.pow(a, 3);

        System.out.println(result);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm");
        System.out.println(simpleDateFormat.format(date.getTime()));
    }
}
