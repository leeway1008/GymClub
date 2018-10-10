package com.example.apple.gymclub;

public class Trainer {
    private String name;
    private int imageId;
    private String intro;
    public Trainer(String name,int imageId,String intro){
        this.name=name;
        this.imageId=imageId;
        this.intro=intro;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
    public String getIntro(){
        return intro;
    }
}
