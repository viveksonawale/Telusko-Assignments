package org.H;

class Person{
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void display(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getId());
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Superman");
        person.setAge(23);
        person.setId(89121);
        person.display();
    }
}
