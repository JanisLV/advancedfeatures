package com.company;

@Mamal(type = "Human")
@google
public class Person {

    private int age;
    String name;

    public Person(int age) {
        this.age = age;
    }

    public int beOlder(){
        age++;
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
