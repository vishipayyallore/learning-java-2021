package com.learnjava.basicdatatypes;

public class ShowNumericLimits {

    public void showDetails(){

        System.out.println( String.format("Byte (byte) Min:%d | Max:%d", Byte.MIN_VALUE, Byte.MAX_VALUE));
        System.out.println( String.format("Short (short) Min:%d | Max:%d", Short.MIN_VALUE, Short.MAX_VALUE));
        System.out.println( String.format("Integer (int) Min:%d | Max:%d", Integer.MIN_VALUE, Integer.MAX_VALUE) );
        System.out.println( String.format("Long (long) Min:%d | Max:%d", Long.MIN_VALUE, Long.MAX_VALUE) );
    }

}
