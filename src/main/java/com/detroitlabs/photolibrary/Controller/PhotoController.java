package com.detroitlabs.photolibrary.Controller;

import com.detroitlabs.photolibrary.Model.Photo;
import com.detroitlabs.photolibrary.Repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class PhotoController {

    @Autowired
    PhotoRepository photoRepository;

    @RequestMapping("/")
    public ModelAndView indexPage(){
        ModelAndView mv = new ModelAndView("home");
        List<Photo> allPhotos = photoRepository.getAllPhotos();
        mv.addObject("photos", allPhotos);

        return mv;
    }

    @RequestMapping("search")
    public ModelAndView searchPage(@RequestParam("searchterm") String searchTerm){
        ModelAndView mv = new ModelAndView("home");
        List<Photo> searchedPhotosMatchingTag = photoRepository.searchMemeByPhotoTag(searchTerm);
        mv.addObject("photos", searchedPhotosMatchingTag);
        System.out.println(searchTerm);
        System.out.println(searchedPhotosMatchingTag.size());


        return mv;
    }
}
