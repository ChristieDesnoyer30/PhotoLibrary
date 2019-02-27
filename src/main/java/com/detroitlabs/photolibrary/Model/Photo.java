package com.detroitlabs.photolibrary.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photo {


//1.) A name
//2.) An upload date
//3.) One or more tags

    private String photoName;
    private LocalDate dateUploaded;
    private ArrayList<String> photoTags;

    public Photo(String photoName, LocalDate dateUploaded, ArrayList<String> photoTags) {
        this.photoName = photoName;
        this.dateUploaded = dateUploaded;
        this.photoTags = new ArrayList<>();
    }



    public String getImagePathName(){

        return  getPhotoName().toLowerCase().replace(" ", "");
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public ArrayList<String> getPhotoTags() {
        return photoTags;
    }

    public void setPhotoTags(ArrayList<String> photoTags) {
        this.photoTags = photoTags;
    }
}
