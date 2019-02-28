package com.detroitlabs.photolibrary.Repository;
import com.detroitlabs.photolibrary.Model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class PhotoRepository {

    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("The Compiler is Scary"
            , "afraidofthecompiler.png", LocalDate.of(2019, 2, 24)
            , "scared")
            , new Photo("That Look When....", "debuggeron.jpg"
                    , LocalDate.of(2019, 02,14), "nervous")
            , new Photo("Programmer's fitness", "howprogrammersrun.jpeg"
                    , LocalDate.of(2019,02,27), "funny")
            ,new Photo("Just Install Java", "installjava.jpg",LocalDate.of(2019,02,25)
                    ,"funny")
            ,new Photo("No Comment...","nocomment.jpg", LocalDate.of(2019,02,27)
                    , "confused")
            , new Photo("No Idea", "noidea.jpg", LocalDate.of(2019,2,25)
                    , "confused no idea")
            , new Photo("Sorting arrays...", "arraysorter.jpg" , LocalDate.of(2019, 2,28)
                    ,"confused  nervous")
            , new Photo("I LOVE CODING", "ilovecoding.jpeg", LocalDate.now()
                    , "excited")
            , new Photo("Obligatory Spongebob Meme", "spongebob.jpg", LocalDate.of(2019, 2,26)
                    , "confused spongebob " )
            , new Photo( "The art of fixing an error", "theartoferrors.jpg", LocalDate.of(2019, 2,1)
                    , "errors fail confused ")
            , new Photo("The Two States of Programming (Or, There Is No In-between)", "thestateofaprogrammer.jpg"
                    , LocalDate.of(2018,2,12), "confused no idea ")

    );



    public List<Photo> getAllPhotos(){

        return ALL_PHOTOS;
    }


    public List<Photo> searchMemeByPhotoTag(String searchTerm){
        List<Photo> searchedPhotosMatchingTag = new ArrayList<>();

        for(Photo photo : ALL_PHOTOS){
            if(photo.getPhotoTags().contains(searchTerm)){
                searchedPhotosMatchingTag.add(photo);
            }
        }


        return searchedPhotosMatchingTag;
    }


    public List<Photo> listMemesByNameAlphabetically(){

        List<Photo> sortedPhotos = new ArrayList<>();
        sortedPhotos = ALL_PHOTOS;




        return sortedPhotos;
    }



}
