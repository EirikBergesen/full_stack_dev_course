package com.eirikdev.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// First api controller written in this api
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    // We use autowired here because it is a service class??
    @Autowired
    private MovieService movieService;
    @GetMapping
//    public String allMovies() {
//        return "All Movies!";
//    }
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }
}
