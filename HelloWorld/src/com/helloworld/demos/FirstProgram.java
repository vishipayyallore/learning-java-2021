package com.helloworld.demos;

public class FirstProgram {

    public static void main(String[] args){

        String userName = "Shiva Sai";
        int userAge = 21;
        Course course = new Course();
        course.level = Course.Level.BEGINNER;

        System.out.println( String.format("Name: %s, Age: %d, Course Level: %s", userName, userAge, course.level) );
    }

}
