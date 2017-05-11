package ee.ut.cs.advancedjava2017.java8streams.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class MovieDatabase {

    private static List<Movie> movieList = null;

    private MovieDatabase() {}

    public static List<Movie> getMovies() {
        if (movieList == null) {
            try {
                initMovieList();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return new ArrayList<>(movieList);
    }

    private static void initMovieList() throws IOException {
        Gson gsonEngine = new Gson();
        try (Reader reader = new InputStreamReader(MovieDatabase.class.getResourceAsStream("/database.json"), "UTF-8")) {
            Gson gson = new GsonBuilder().create();
            Movie[] movies = gson.fromJson(reader, Movie[].class);
            movieList = Arrays.asList(movies);
        }
    }
}
