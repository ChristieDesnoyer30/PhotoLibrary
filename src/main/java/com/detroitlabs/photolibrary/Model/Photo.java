package com.detroitlabs.photolibrary.Model;

import java.time.LocalDate;

public class Photo {


//1.) A name
//2.) An upload date
//3.) One or more tags

    private String photoName;
    private String imagePath;
    private LocalDate dateUploaded;
    private String photoTags;

    public Photo(String photoName,String imagePath,  LocalDate dateUploaded, String photoTags) {
        this.photoName = photoName;
        this.imagePath = imagePath;
        this.dateUploaded = dateUploaded;
        this.photoTags = photoTags;
    }




    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    //
//    public String getImagePathName(){
//
//        return  getPhotoName().toLowerCase().replace(" ", "");
//    }

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

    public String getPhotoTags() {
        return photoTags;
    }

    public void setPhotoTags(String photoTags) {
        this.photoTags = photoTags;
    }


    @Override
    public String toString() {
        return "Photo{" +
                "photoName='" + photoName + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", dateUploaded=" + dateUploaded +
                ", photoTags='" + photoTags + '\'' +
                '}';
    }
}
