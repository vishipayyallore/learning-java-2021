package com.learnjava.basicdatatypes;

public class DisplayPattern {

    static final String DEFAULT_PATTERN = " ";

    public static boolean displayHeader(String title){

        int patternLength = 100;
        int leftPadding = (patternLength - title.length())/2;

        System.out.println(repeatPattern(patternLength, "="));
        System.out.println( String.format("%s%s", repeatPattern(leftPadding), title));
        System.out.println(repeatPattern(patternLength, "-"));

        return true;
    }

    public static String repeatPattern(int length, String pattern) {
        return new String(new char[length]).replace("\0", pattern);
    }

    public static String repeatPattern(int length) {
        return new String(new char[length]).replace("\0", DEFAULT_PATTERN);
    }

}
