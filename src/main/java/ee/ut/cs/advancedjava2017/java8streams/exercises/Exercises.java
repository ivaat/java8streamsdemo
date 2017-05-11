package ee.ut.cs.advancedjava2017.java8streams.exercises;

import ee.ut.cs.advancedjava2017.java8streams.data.Movie;
import ee.ut.cs.advancedjava2017.java8streams.data.MovieDatabase;

import java.util.List;
import java.util.Map;

public class Exercises {
    public static void main(String[] args) {
        //TODO - implement the algorithm for all of the below methods as "one-liner" function chains
    }

    private static List<String> getDistinctDirectors() {
        List<Movie> movies = MovieDatabase.getMovies();

        //TODO - return a set of distinct strings, representing the names of directors in the movie list
        return null;
    }

    private static List<Movie> getMoviesAfter2000() {
        List<Movie> movies = MovieDatabase.getMovies();

        //TODO - return the list of movies that came out in 2000 or later
        return null;
    }

    private static List<Movie> getSortedByMetacriticRating() {
        List<Movie> movies = MovieDatabase.getMovies();

        //TODO - return the list of movies sorted by their metacritic rating in the descending order
        return null;
    }

    private static List<Movie> getSortedByRuntime() {
        List<Movie> movies = MovieDatabase.getMovies();

        //TODO - return the list of movies sorted by their runtime (in minutes) in the descending order
        return null;
    }

    private static boolean areAllMoviesEnglish() {
        List<Movie> movies = MovieDatabase.getMovies();

        //TODO - return boolean indicating whether it is true that all top20 movies are at least partially in English
        return false;
    }

    private static boolean isLatinLanguageRepresented() {
        List<Movie> movies = MovieDatabase.getMovies();

        ///TODO - return boolean indicating whether it is true that at least one of the top20 movies is at least partially in Latin
        return false;
    }

    private static List<Movie> getTop5BoxOffice() {
        List<Movie> movies = MovieDatabase.getMovies();

        //TODO - return the list of 5 top box office grossing movies.
        //note that box office string needs to be parsed, and that not all movies have box office data available!
        return null;
    }

    private static List<Movie> getSortedByAggregatedRating() {
        List<Movie> movies = MovieDatabase.getMovies();

        //TODO - return the list of movies sorted by their normalized & aggregated rating
        //for example the total aggregated points for Forrest Gump:
        //imdb = 8.8/10 = 88 points
        //rotten tomatoes = 72% = 72 points
        //metacritic = 82/100 = 82 points
        //total: 88 + 72 + 82 = 242 points

        return null;
    }

    private static Map<Movie, Integer> getAggregatedRatingMap() {
        List<Movie> movies = MovieDatabase.getMovies();

        //TODO - basically the above, but return the data as movie-to-integer map where integer is the total aggregated rating

        return null;
    }

}
