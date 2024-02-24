package com.example.retrofitpractise1;

import com.google.gson.annotations.SerializedName;

public class DataModel {


    // this clas will act as template for the data we are going to pass

    private int userId;
    private int id;
    private String title;
    private boolean  completed;

    //we can also use this if we want to change the variable name
//    @SerializedName("completed")
//    private boolean status;


//getters
    //its mandatory to get the data from api


    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean iscompleted() {
        return completed;
    }
}
