package com.learnjava.basicdatatypes;

public class Main {

    static final char DEFAULT_SPACE = ' ';
    static final char NULL_CHARACTER = '\0';
    static final char DEFAULT_TOP_PATTERN = '=';
    static final char DEFAULT_BOTTOM_PATTERN = '-';
    static final char DEFAULT_FOOTER_PATTERN = '*';

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    /*
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    */

    public static void main(String[] args) {

        ShowNumericLimits showNumericLimits = new ShowNumericLimits();

        System.out.println(TEXT_BLUE + "This text is red!" + TEXT_RESET);

        displayHeader("Basic Numeric Type Limits", DEFAULT_TOP_PATTERN, DEFAULT_BOTTOM_PATTERN);
        showNumericLimits.showDetails();
        System.out.println( String.format("%s%s%s", ANSI_PURPLE, repeatPattern(100, DEFAULT_FOOTER_PATTERN), TEXT_RESET ) );
        System.out.println();

        showPrimitiveDataTypesDemo();

        // Few Important Points
        System.out.println( String.format("Integer.MIN_VALUE/2 === %d", (Integer.MIN_VALUE/2)));
        System.out.println( String.format("Short.MIN_VALUE/2 === %d", (Short.MIN_VALUE/2)));
        System.out.println( String.format("Byte.MIN_VALUE/2 === %d", (Byte.MIN_VALUE/2)));
    }

    private static void showPrimitiveDataTypesDemo() {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(String.format("Long Value: %d", longValue));
    }

    public static boolean displayHeader(String title, char topPattern, char bottomPattern){

        int patternLength = 100;
        int leftPadding = (patternLength - title.length())/2;

        System.out.println( String.format("%s%s%s", ANSI_PURPLE,repeatPattern(patternLength, topPattern), TEXT_RESET));
        System.out.println( String.format("%s%s%s%s", ANSI_PURPLE,repeatPattern(leftPadding), title, TEXT_RESET));
        System.out.println( String.format("%s%s%s", ANSI_PURPLE,repeatPattern(patternLength, bottomPattern), TEXT_RESET));

        return true;
    }

    public static String repeatPattern(int length, char pattern) {
        return new String(new char[length]).replace(NULL_CHARACTER, pattern);
    }

    public static String repeatPattern(int length) {
        return new String(new char[length]).replace(NULL_CHARACTER, DEFAULT_SPACE);
    }

}
