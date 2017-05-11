package ee.ut.cs.advancedjava2017.java8streams.lesson.methodreferences;

import ee.ut.cs.advancedjava2017.java8streams.data.Movie;
import ee.ut.cs.advancedjava2017.java8streams.data.MovieDatabase;

import java.util.*;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Movie> movies = MovieDatabase.getMovies();
        Collections.sort(movies, (o1, o2) -> Integer.compare(Integer.parseInt(o1.getYear()), Integer.parseInt(o2.getYear())));

        for (Movie movie : movies) {
            System.out.println(movie);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.forEach((id, val) -> System.out.println(val));
    }
}
