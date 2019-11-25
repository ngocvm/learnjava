package com.ngocvm.example.Day55;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dragon implements Animal {
    protected String name = "A";
    private static String date = "20191004";

    public Dragon(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("The dragon " + name + " is flying");
    }

    public static void main(String[] args) {
//        new Dragon("B").move();
        String pattern = "yyyyMMdd";
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String currentDate =simpleDateFormat.format(calendar.getTime());
        System.out.println("Date: " + currentDate);

        System.out.println("Checking date: " + getCheckingDate());

        String text    =
                "John writes about this, and John Doe writes about that," +
                        " and John Wayne writes about everything."
                ;

        String patternString1 = "(John) (.+?) ";

        Pattern pattern2 = Pattern.compile(patternString1);
        Matcher matcher = pattern2.matcher(text);

        while(matcher.find()) {
            System.out.println("found: " + matcher.group(0) +
                    " "       + matcher.group(1));
        }

        String checkDate = "2019-10-25";
        String date = checkDate.replaceAll("-", "");
        System.out.println("Date=" + date + ", CheckDate=" + checkDate);
    }

    private static String getCheckingDate() {
        String dateStr;
        if(date == null || date.trim().length() == 0) {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DAY_OF_MONTH, -1);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            dateStr = format.format(cal.getTime());
            date = dateStr.replaceAll("-", "");
        } else {
            dateStr = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6,8);
        }

        return dateStr;
    }
}
