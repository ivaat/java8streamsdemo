package ee.ut.cs.advancedjava2017.java8streams.lesson.lambdas;

import ee.ut.cs.advancedjava2017.java8streams.data.Movie;
import ee.ut.cs.advancedjava2017.java8streams.data.MovieDatabase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class YearComparisonDemo {
    public static void main(String[] args) {
        List<Movie> movies = MovieDatabase.getMovies();

        //classic way:
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return Integer.compare(Integer.parseInt(o1.getYear()), Integer.parseInt(o2.getYear()));
            }
        });

        for (Movie movie : movies) {
            System.out.println(movie.getYear());
            System.out.println(movie);
            System.out.println("----------");
        }



        //replace with lambda:
        Collections.sort(movies, (Movie o1, Movie o2) -> {
            return Integer.compare(Integer.parseInt(o1.getYear()), Integer.parseInt(o2.getYear()));
        });



        //remove unnecessary parameter types:
        //(for methods with one parameter, you could skip () parentheses as well)
        Collections.sort(movies, (o1, o2) -> {
            return Integer.compare(Integer.parseInt(o1.getYear()), Integer.parseInt(o2.getYear()));
        });



        //replace with expression lambda:
        //for one-line methods you can skip {} braces as well as the return keyword
        Collections.sort(movies, (o1, o2) ->
                Integer.compare(Integer.parseInt(o1.getYear()), Integer.parseInt(o2.getYear())));
    }
}
