package com.example.week3;

import java.lang.*;

public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;
    public Customer() {
        this.ID = "";
        this.name = null;
        this.sex = false;
        this.age = 0;
    }

    public Customer(String ID, String name, String sex, int age) {
        this.setID(ID);
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getSex() {
        return sex;
    }
    public void setSex(String sex) {
        if(sex.equals("male") || sex.equals("Male")) {
            this.sex = true;
        }
        else if(sex.equals("female") || sex.equals("Female")){
            this.sex = false;
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age < 0 ? 0 : age;
    }
}