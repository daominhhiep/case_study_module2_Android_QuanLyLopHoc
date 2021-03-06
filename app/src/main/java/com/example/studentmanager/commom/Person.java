package com.example.studentmanager.commom;

import java.io.Serializable;

public class Person implements Serializable {
    private String id;
    private String name;
    private String age;
    private String address;
    private String classroom;

    private  Person(){

    }

    public Person(String id, String name, String age, String address, String classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.classroom = classroom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
