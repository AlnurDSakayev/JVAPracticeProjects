package com.company;

import java.util.*;

public class Client extends Person implements Addr{
    Scanner in = new Scanner(System.in);
    String taxiClass;
    int cost;


    public Client(String name, String phoneNumber, String taxiClass, int cost){
        super(name, phoneNumber);
        this.cost = cost;
        this.taxiClass = taxiClass;
    }

    @Override
    public void addr(){
        HashMap<Integer , Integer> hashAddr = new HashMap<>();
        hashAddr.put(1, 500);
        hashAddr.put(2, 600);
        hashAddr.put(3, 800);

        System.out.println("Choose address, 1 - Zhetysu, 2 - Aksay, 3 - Mamyr");
        int addressIn = in.nextInt();
        for(Map.Entry<Integer, Integer>pair: hashAddr.entrySet()){
            if(addressIn==pair.getKey()) {
                cost = pair.getValue();
                return;
            }
        }
    }

    public void taxCl(){
        HashMap<Integer , Integer> hashTax = new HashMap<>();
        hashTax.put(1, 100);
        hashTax.put(2, 150);
        hashTax.put(3, 200);
        System.out.println("Choose taxi class, 1 - econom, 2 - comfort, 3 - business");
        int classIn = in.nextInt();
        if(classIn == 1)
            taxiClass = "Econom";
        else if (classIn ==2)
            taxiClass = "Comfort";
        else
            taxiClass = "Business";

        for(Map.Entry<Integer, Integer>pair: hashTax.entrySet()){
            if(classIn==pair.getKey()) {
                cost = cost * pair.getValue()/100;
                return;
            }
        }
    }
    @Override
    public void info(){
        System.out.println("name " + getName());
        System.out.println("phone " + getPhoneNumber());
        System.out.println("class " + taxiClass);
        System.out.println("cost " + cost);
    }

    @Override
    public void actions(){
        addr();
        taxCl();
        info();
    }
}
