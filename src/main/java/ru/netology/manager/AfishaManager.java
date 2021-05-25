package ru.netology.manager;

import ru.netology.domain.Movie;

public class AfishaManager {
    private Movie[] movies;
    private int count = 10;

    public AfishaManager(int count) {
        this.count = count;
    }

    public AfishaManager() {
    }

    public void add (Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length -1] = movie;
        movies = tmp;
    }

    public Movie[] getLast() {
        Movie[] lastMovies = new Movie[10];
        for (int i = 0; i <= lastMovies.length; i++) {
            lastMovies[i] = movies[movies.length - 1 - i];
        }
        return lastMovies;
    }

    public Movie[] getAll() {
        Movie[] getMovies = new Movie[0];
        for(int i = 0; i <= movies.length; i++) {
            getMovies[i] = movies[movies.length-1];
        }
        return getMovies;
    }
}
