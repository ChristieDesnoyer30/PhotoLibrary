package com.detroitlabs.photolibrary.Controller;

import com.detroitlabs.photolibrary.Repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhotoController {

    @Autowired
    PhotoRepository photoRepository;

    @RequestMapping("/")
    public ModelAndView indexPage(){
        ModelAndView mv = new ModelAndView("home");

        return mv;
    }
}
