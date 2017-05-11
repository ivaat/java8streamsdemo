package ee.ut.cs.advancedjava2017.java8streams.lesson.streams;

import ee.ut.cs.advancedjava2017.java8streams.data.Movie;
import ee.ut.cs.advancedjava2017.java8streams.data.MovieDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ListStreamDemo {

    /*
        stream is a pipeline of functions that can be evaluated and which can perform data
        stream is NOT a data structure, and definitely not a mutable data structure
     */


    public static void main(String[] args) {
        List<Movie> movies = MovieDatabase.getMovies();

        //create copy
        //intermediary vs terminal operations
        List<Movie> copy = movies.stream().collect(Collectors.toList());

        //peek
        List<Movie> copy2 = movies.stream()
                .peek(m -> System.out.println(m))
                .collect(Collectors.toList());
        //can this be written in some other way?


        //map
        List<Integer> years = movies.stream()
                .map(m -> Integer.parseInt(m.getYear()))
                .peek(y -> System.out.println(y))
                .collect(Collectors.toList());


        //filter using predicate
        List<Movie> dramaMovies = movies.stream()
                .filter(m -> m.getGenre().contains("Fantasy"))
                .collect(Collectors.toList());


        //filter + count
        long lotrMovies = movies.stream()
                .filter(m -> m.getDirector().equals("Peter Jackson"))
                .count();


        //distinct
        List<String> distinctDirectors = movies.stream()
                .map(m -> m.getDirector())
                .distinct()
                .collect(Collectors.toList());


        //set + flatmap
        Set<String> fantasyActors = movies.stream()
                .filter(m -> m.getGenre().contains("Fantasy"))
                .map(m -> m.getActors().split(","))
                .flatMap(aa -> Arrays.stream(aa))
                .map(a -> a.trim())
                .collect(Collectors.toSet());
    }
}
