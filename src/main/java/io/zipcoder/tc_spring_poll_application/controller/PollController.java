package io.zipcoder.tc_spring_poll_application.controller;

import io.zipcoder.tc_spring_poll_application.repositories.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {

    PollRepository pollRepository;
    @Autowired
    public PollController(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }
}
