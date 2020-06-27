package com.company;

@Mamal(type = "Human")
@google
public class Person {

    private int age;
    String name;

    public Person(String john, String smith, int age) {
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

    public boolean isAdult(Person person) {
        return this.age>=18;
    }
}
