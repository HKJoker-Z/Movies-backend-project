package com.z2.movies.demo.controller;


import com.z2.movies.demo.model.Movie;
import com.z2.movies.demo.reposity.MovieRepository;
import com.z2.movies.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie")
@CrossOrigin
public class MovieController {

    @Autowired
    private MovieService movieService;
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/getAll")
    public List<Movie> getAllMovies() {
        //Request get to show all movies
        return movieService.getMovies();
    }

    // find a movie by genre
    @GetMapping("/{genre}")
    public List<Movie> getMovieByGenre(@PathVariable("genre") String genre) {
        List<Movie> movie = movieRepository.findByGenre(genre);

        return movie;
    }

    @PostMapping("/add")
    public String add(@RequestBody Movie movie) {
        movieService.addMovie(movie);
        return "success!";
    }

    @PutMapping(path = "/update")
    public String update(@RequestBody Movie movie) {
        movieService.updateMovie(movie);
        return "success!";
    }

    @DeleteMapping(path = "/{movieId}")
    public String delete(@PathVariable("movieId") int movieID) {
        movieService.deleteMovie(movieID);
        return "success!";
    }

    @DeleteMapping("/delete/all")
    public String deleteAll() {
        movieRepository.deleteAll();

        return "success!";
    }
}
