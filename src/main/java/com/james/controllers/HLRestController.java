package com.james.controllers;


import com.james.entities.Lecturer;
import com.james.entities.Review;
import com.james.services.LecturerRepository;
import com.james.services.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jamesyburr on 7/1/16.
 */
@RestController
public class HLRestController {

    @Autowired
    LecturerRepository lecturers;

    @Autowired
    ReviewRepository reviews;

    @RequestMapping(path = "/lecturers", method = RequestMethod.GET)
    public Iterable<Lecturer> lctrs () {
        return lecturers.findAll();
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.GET)
    public Iterable<Review> rvws () {
        return reviews.findAll();
    }
}

