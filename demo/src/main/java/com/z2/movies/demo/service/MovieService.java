package com.z2.movies.demo.service;

import com.z2.movies.demo.model.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> getMovies();
    public Movie addMovie(Movie movie);
}
