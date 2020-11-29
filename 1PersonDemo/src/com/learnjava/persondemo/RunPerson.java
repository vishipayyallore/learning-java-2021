package com.learnjava.persondemo;

public class RunPerson {

    public static void main(String[] args){
        Person person = new Person();
        Person person1 = new Person("Liji Philip", 26, Gender.FEMALE);

        System.out.println(person);
        System.out.println(person1);
    }

}
