package com.company;

public abstract class Person{
    private String name;
    private String phoneNumber;

    public Person(String name, String phoneNumber){
        this.name =name ;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){return name;}
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public abstract void info();
    public abstract void actions();







}
