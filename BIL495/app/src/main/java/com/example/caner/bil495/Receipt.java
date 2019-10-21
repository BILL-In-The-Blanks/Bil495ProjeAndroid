package com.example.caner.bil495;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    List<Tag> taglist;
    String totalcost;
    String location;
    String date;//Belki Date classı olabilir
    //photo
    public Receipt(){
    taglist = new ArrayList<Tag>() ;
    totalcost = "";
    location = "";
    date = "00.00.00";
    }
    public Receipt(String totalcost, String location, String date){
        taglist = new ArrayList<Tag>() ;
        this.totalcost = totalcost;
        this.location = location;
        this.date = date;
    }
    void addTag(Tag tag){
        this.taglist.add(tag);
    }
    void removeTag(Tag tag){
        this.taglist.remove(tag);
    }
    void setTotalCost(String s){
        this.totalcost = s;
    }
    String getTotalCost(){
        return this.totalcost;
    }
    void setLocation(String s){
        this.location = s;
    }
    String getLocation(){
        return this.location;
    }
    void SetDate (String s){
        this.date = s;
    }
    String getDate(){
        return this.date;
    }
}
