package com.z2.movies.demo.service;

import com.z2.movies.demo.model.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> getMovies();
    public Movie addMovie(Movie movie);

    //update genre in one Movie
    public Movie updateMovie(Movie movie);

    //delete a movie by id
    public void deleteMovie(int movieId);
}
