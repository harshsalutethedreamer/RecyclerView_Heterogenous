package com.example.user.recyclerview_heterogenous;

/**
 * Created by user on 8/12/2017.
 */

public class User {

    public String name;
    public String address;

    public User() {
    }

    public User(String name,String address){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
