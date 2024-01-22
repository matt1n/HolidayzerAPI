package com.holidayzer.api.controller;

public class Holidays {
    private String date;
    private String name;

    public Holidays() {

    }

    public Holidays(String date, String name){
        this.setDate(date);
        this.setName(name);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getDate(){
        return this.date;
    }

    public void setDate(String date){
        this.date = date;
    }
}
