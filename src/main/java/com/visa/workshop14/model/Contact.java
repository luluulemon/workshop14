package com.visa.workshop14.model;

import java.io.Serializable;
import java.util.Random;

public class Contact implements Serializable {
    // If you want a class object to be serializable, all you need to do it 
    //  implement the java. io. Serializable interface. Serializable in java is a marker 
    //  interface and has no fields or methods to implement.
    

    private String name;
    private String email;
    private int phoneNumber;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Contact(){
        this.id = generateId(8);

    }

    public Contact(String name, String email, int phoneNumber){
        this.id = generateId(8);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private synchronized String generateId(int numchars){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        while(sb.length()< numchars){
            sb.append(Integer.toHexString(r.nextInt()));
        }

        return sb.toString().substring(0,numchars);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
