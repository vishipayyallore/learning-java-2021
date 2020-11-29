package com.learnjava.persondemo;

public class Person {

    String name;
    int age;
    Gender gender;

    Person(){
        name = "No Name";
        age = 21;
        gender = Gender.MALE;
    }

    Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString(){
        return  String.format("Name: %s, Age: %d, Gender: %s", name, age, gender);
    }

}
