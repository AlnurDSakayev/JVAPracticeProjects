package com.company;

import java.util.Scanner;

public class Taxi extends Person implements Call{
    Scanner in = new Scanner(System.in);
    String clientAdress;

    public String getClientAdress() {
        return clientAdress;
    }

    public Taxi(String name, String phoneNumber, String clientAdress){
        super(name, phoneNumber);
        this.clientAdress =clientAdress;
    }
    @Override
    public void info(){
        System.out.println("name: " + getName());
        System.out.println("phone number: " + getPhoneNumber());
        System.out.println("client address: " + clientAdress);
    }

    @Override
    public void call(){
        System.out.println("Calling client");
    }

    @Override
    public void actions(){
        System.out.println("To get client information choose 1, To call to client choose 2");
        int actionNum;
        actionNum =in.nextInt();
        if (actionNum == 1){
            info();
        }
        else if(actionNum ==2){
            call();
        }
    }









}
