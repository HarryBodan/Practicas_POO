package models;

public class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + " Estoy estudiando " + course;
    }
}
