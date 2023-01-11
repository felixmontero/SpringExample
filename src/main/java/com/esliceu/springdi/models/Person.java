package com.esliceu.springdi.models;

public class Person {
    int id;

    public String getName() {
        return name;
    }

    String name;

    public int  getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name=name;
    }
}
