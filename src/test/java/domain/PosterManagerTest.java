package domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

    PosterManager service = new PosterManager();

    {
    }

    String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
    };

    @Test
    public void shouldGetPoster() {
        PosterManager service = new PosterManager();
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] actual = service.getPoster(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie() {
        PosterManager service = new PosterManager();
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne", "ZERO"};
        String[] actual = service.addMovie("ZERO", poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_one() {
        PosterManager service = new PosterManager(5);
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_two() {
        PosterManager service = new PosterManager(10);
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_three() {
        PosterManager service = new PosterManager(11);
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_four() {
        PosterManager service = new PosterManager(0);
        String[] expected = {"numberOne"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

}

