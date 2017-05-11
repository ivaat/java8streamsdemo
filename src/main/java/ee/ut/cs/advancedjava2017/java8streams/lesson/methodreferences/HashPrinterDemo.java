package ee.ut.cs.advancedjava2017.java8streams.lesson.methodreferences;

import ee.ut.cs.advancedjava2017.java8streams.data.Movie;
import ee.ut.cs.advancedjava2017.java8streams.data.MovieDatabase;

import java.util.List;

public class HashPrinterDemo {
    public static void main(String[] args) {
        List<Movie> movies = MovieDatabase.getMovies();

        movies.forEach(HashPrinterDemo::printHash);
        //TODO - demo static vs instance
    }

    private static void printHash(Object object) {
        int hash = object.hashCode();
        System.out.println(hash);
    }
}
