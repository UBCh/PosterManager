package domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    public void shouldGetPoster() {
        PosterManager service = new PosterManager("ZERO", 5);
        service.getPoster();
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne ", "ZERO"};
        String[] actual = service.getPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie() {
        PosterManager service = new PosterManager("ZERO", 5);
        service.addMovie();
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne ", "ZERO"};
        String[] actual = service.addMovie();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies() {
        PosterManager service = new PosterManager("ZERO", 5);
        service.showAddedMovies();
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade"};
        String[] actual = service.showAddedMovies();
        assertArrayEquals(expected, actual);
    }

}