package com.ngocvm.example.Day113;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class FormattingTest {
    public static void main(String[] args) throws IOException {
        String title = "Effective Java";
        float price = 33.953f;
        System.out.format("%s is a great book. It is sold at %.2f USD today. %n", title, price);

        //--- uses the flag ‘-‘ to left-justify the Strings with the width of 30 characters (%-30s):
        List< String > listBook = Arrays.asList(
                "Head First Java",
                "Effective Java",
                "The Passionate Programmer",
                "Head First Design Patterns"
        );
        for (String book : listBook) {
            System.out.format("%-30s - In Stock%n", book);
        }

        //--- prints numbers in both decimal format (%d) and hexadecimal format (%x and %#x)
        System.out.format("Min value of a byte: %d (%1$#x)%n", Byte.MIN_VALUE);
        System.out.format("Max value of a byte: %d (%1$#x)%n", Byte.MAX_VALUE);
        System.out.format("Min value of an int: %d (%1$#x)%n", Integer.MIN_VALUE);
        System.out.format("Max value of an int: %d (%1$x)%n", Integer.MAX_VALUE);

        //--- uses the t prefix with date time conversions (T, F and D) to write formatted Strings of current time and date to a text file
        PrintWriter writer = new PrintWriter(new File("datetime.txt"));
        writer.format("Now is %tT %n", new Date());
        writer.format("Today is %tF %n", new Date());
        writer.format("Today is %tD %n", new Date());
        writer.close();

        //---  formats numbers to a specific locale (use another overload of the format() method that takes a Locale):
        long k = 1000;
        long m = 1000000;
        long t = 1000000000;

        System.out.println("French locale:");
        System.out.format(Locale.FRENCH, "One thousand: %,d %n", k);
        System.out.format(Locale.FRENCH, "One million: %,d %n", m);
        System.out.format(Locale.FRENCH, "One billion: %,d %n", t);

        System.out.println("Default locale:");
        System.out.format("One thousand: %,d %n", k);
        System.out.format("One million: %,d %n", m);
        System.out.format("One billion: %,d %n", t);

        //---  code formats the output nicely to make it looks like columns:
        String specifiers = "%-30s %-20s %-5.2f%n";
        System.out.format(specifiers, "Head First Java", "Kathy Sierra", 23.99f);
        System.out.format(specifiers, "Thinking in Java", "Bruce Eckel", 25.69f);
        System.out.format(specifiers, "Effective Java", "Joshua Bloch", 27.88f);
        System.out.format(specifiers, "The Passionate Programmer", "Chad Fowler", 41.99f);
        System.out.format(specifiers, "Code Complete", "Steve McConnell", 38.42f);

        //---  formats floating point numbers into scientific notation (using the e/E and g conversions):
        float k1 = 1000f;
        float m1 = 1000000f;
        float t1 = 1000000000f;

        System.out.format("One thousand: %.1e %n", k1);
        System.out.format("One million: %.1E %n", m1);
        System.out.format("One billion: %.2g %n", t1);

        //--- formats numbers with zero-padded for numbers that are less than 5 character (%05d);
        //--- encloses a negative number in parenthesis (%(d); and always includes sign for numbers (%+d)
        System.out.format("%05d %n", 12);
        System.out.format("%05d %n", 2016);
        System.out.format("%05d %n", 365);
        System.out.format("%05d %n", 19001800);
        System.out.format("%(d %n", -1234);
        System.out.format("%+d %n", 567);
        System.out.format("%+d %n", -891);

        //--- If we specify the width without the flag, the output is right-justified within the specified width,
        System.out.format("%20s %s %n", "Full Name: ", "John");
        System.out.format("%20s %s %n", "E-mail Address: ", "john@gmail.com");
        System.out.format("%20s %s %n", "City: ", "New York");
        System.out.format("%20s %s %n", "Country: ", "United States");
    }
}
