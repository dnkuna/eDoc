package com.ushannlabs.doc.Model;

public class User {
    //attribus
    private String Name;
    private String Password;
    private String Phone;
    private String Addresse;

    //default constructor

    public User() {
    }
    //constructor

    public User(String name, String password, String phone, String addresse) {
        Name = name;
        Password = password;
        Phone = phone;
        Addresse = addresse;
    }

    //Getters
    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddresse() {
        return Addresse;
    }

    //setters

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setAddresse(String addresse) {
        Addresse = addresse;
    }
}


