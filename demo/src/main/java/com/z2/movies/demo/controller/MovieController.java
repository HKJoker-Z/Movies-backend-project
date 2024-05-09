package com.z2.movies.demo.controller;


import com.z2.movies.demo.model.Movie;
import com.z2.movies.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/getAll")
    public List<Movie> getAllMovies() {
        //Request get to show all movies
        return movieService.getMovies();
    }

    @PostMapping("/add")
    public String add(@RequestBody Movie movie) {
        movieService.addMovie(movie);
        return "success!";
    }
}
