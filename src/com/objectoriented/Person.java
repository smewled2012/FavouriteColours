package com.objectoriented;

import java.util.HashSet;

public class Person {
    private String name;
    private String email;
    private String favColor;
    HashSet<Person> listPeople;

    public Person(){
        listPeople =new HashSet<>();
    }

    public HashSet<Person> getListPeople() {
        return listPeople;
    }

    public void setListPeople(HashSet<Person> listPeople) {
        this.listPeople = listPeople;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addPersonColl(Person aPerson){
        this.listPeople.add(aPerson);
    }

}
