package ee.ut.cs.advancedjava2017.java8streams.lesson.streams;

import ee.ut.cs.advancedjava2017.java8streams.data.Movie;
import ee.ut.cs.advancedjava2017.java8streams.data.MovieDatabase;

import java.util.List;

public class MatchersDemo {
    public static void main(String[] args) {
        anyMatchDemo();
        //allMatchDemo();
        //noneMatchDemo();
    }

    private static void anyMatchDemo() {
        List<Movie> movieList = MovieDatabase.getMovies();

        //problem: do any of the "Actors" string contain "Elijah Wood"?

        //old school solution
        boolean frodo1 = false;
        for (Movie movie : movieList) {
            if (movie.getAwards().contains("Elijah Wood")) {
                frodo1 = true;
                break; //often forgotten, causing performance issues
            }
        }

        System.out.println(frodo1);

        //with anyMatch
        boolean frodo2 = movieList.stream().anyMatch(m -> m.getActors().contains("Elijah Wood"));

        System.out.println(frodo2);

        //how about the fat hobbit
        System.out.println(movieList.stream().anyMatch(m -> m.getActors().contains("Sean Astin")));
    }


    private static void allMatchDemo() {
        List<Movie> movieList = MovieDatabase.getMovies();

        //problem: are all of the movies in the Drama genre?

        //old school solution
        boolean allDrama1 = true;
        for (Movie movie : movieList) {
            if (!movie.getGenre().contains("Drama")) {
                allDrama1 = false;
                break;
            }
        }

        System.out.println(allDrama1);

        //with allMatch
        boolean allDrama2 = movieList.stream().allMatch(m -> m.getGenre().contains("Drama"));

        System.out.println(allDrama2);


        //another example - all movies after 1950?
        boolean allAfter1950 = movieList.stream()
                .map(m -> Integer.parseInt(m.getYear()))
                .allMatch(y -> y > 1950);

        System.out.println(allAfter1950);
    }

    private static void noneMatchDemo() {
        List<Movie> movieList = MovieDatabase.getMovies();

        //problem: is it true that no movies in top20 are comedies?

        //old school solution
        boolean noComedies1 = true;
        for (Movie movie : movieList) {
            if (movie.getGenre().contains("Comedy")) {
                noComedies1 = false;
                break;
            }
        }

        System.out.println(noComedies1);

        boolean noComedies2 = movieList.stream().noneMatch(m -> m.getGenre().contains("Comedy"));

        System.out.println(noComedies2);
    }


}
