package com.detroitlabs.photolibrary.Repository;
import com.detroitlabs.photolibrary.Model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PhotoRepository {

    private static final List<Photo> ALL_PHOTOS = Arrays.asList(new Photo("The Compiler is Scary"
            , "afraidofthecompiler.png", LocalDate.of(2019, 2, 24)
            , "scared"),
            new Photo("That Look When....", "debuggeron.jpg"
                    , LocalDate.of(2019, 02,14), "nervous"));



    public List<Photo> getAllPhotos(){

        return ALL_PHOTOS;
    }

}
