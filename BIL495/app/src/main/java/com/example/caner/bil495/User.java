package com.example.caner.bil495;

public class User {
    String username;
    String password;
    int delete_date;

    pubic User(){
        username = "";
        password = "";
        delete_date = 30;

    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String s){
        this.username = s;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String s){
        this.password = s;
    }
    public int getDeleteDate(){
        return this.delete_date;
    }
    public void setDeleteDate(int i){
        this. delete_date = i;
    }
}
