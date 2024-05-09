package com.z2.movies.demo.service;

import com.z2.movies.demo.model.Movie;
import com.z2.movies.demo.reposity.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(int movieId) {
        movieRepository.findById(movieId).orElseThrow(() -> new IllegalArgumentException("Movie not found"));
        movieRepository.deleteById(movieId);
    }
}
