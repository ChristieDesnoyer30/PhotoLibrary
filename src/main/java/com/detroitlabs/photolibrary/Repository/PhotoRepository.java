package com.detroitlabs.photolibrary.Repository;
import com.detroitlabs.photolibrary.Model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
                    , "confused"),
            new Photo("Sorting arrays...", "arraysorter.jpg" , LocalDate.of(2019, 2,28)
                    ,"confused  nervous")

    );



    public List<Photo> getAllPhotos(){

        return ALL_PHOTOS;
    }

}
