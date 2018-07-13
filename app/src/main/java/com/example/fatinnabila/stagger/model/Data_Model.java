package com.example.fatinnabila.stagger.model;

/**
 * Created by fatin nabila on 13/7/2018.
 */

public class Data_Model {

    // Getter and Setter model for recycler view items
    private String title;
    private int image;

    public Data_Model(String title,  int image) {

        this.title = title;

        this.image = image;
    }

    public String getTitle() {
        return title;
    }



    public int getImage() {
        return image;
    }
}