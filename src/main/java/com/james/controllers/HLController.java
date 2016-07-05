package com.james.controllers;

import com.james.entities.Lecturer;
import com.james.entities.Review;
import com.james.services.LecturerRepository;
import com.james.services.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jamesyburr on 7/1/16.
 */
@Controller
public class HLController {

    @Autowired
    LecturerRepository lecturers;

    @Autowired
    ReviewRepository reviews;

    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)
    public String addLctr (String name, String topic, String image) {
        Lecturer lctr = new Lecturer(name, topic, image);
        lecturers.save(lctr);
        return "index";
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
    public String addRvw (String author, String text, boolean isGood, int lecturerId) {
        Review rvw = new Review(author, text, isGood, lecturers.findOne(lecturerId));
        reviews.save(rvw);
        return "index";
    }
}
