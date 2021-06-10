package com.company;

public class Personn {
    private String fullname;
    private int age;

    public Personn(String fullname, int age) {
        this.fullname=fullname;
        this.age=age;

    }
    public Personn() {
    }
    public void talk() {
        System.out.println("говорит");
    }
    public void move(){
        System.out.println("move") ;
    }
    public void setFullname(String fullname){this.fullname=fullname;}
    public void setAge(int age){this.age=age;}
    public String getFullname(){return fullname;}
    public int getAge(){return age;}




}
