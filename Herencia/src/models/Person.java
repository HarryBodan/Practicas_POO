package models;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduceYourself() {
        return "Hola, mi nombre es " + name + " y tengo " + age + " anios.";
    }
}
