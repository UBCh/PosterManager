package domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    PosterManager service = new PosterManager();

    {
    }

    @Test
    public void shouldGetPoster() {
        PosterManager service = new PosterManager(5);
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] actual = service.getPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie() {
        PosterManager service = new PosterManager(5);
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne", "ZERO"};
        String[] actual = service.addMovie("ZERO");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_one() {
        PosterManager service = new PosterManager(5);
        service.addMovie("ZERO");
        String[] expected = {"ZERO", "numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen"};
        String[] actual = service.showAddedMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_two() {
        PosterManager service = new PosterManager(10);
        service.addMovie("ZERO");
        String[] expected = {"ZERO", "numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_three() {
        PosterManager service = new PosterManager(11);
        service.addMovie("ZERO");
        service.addMovie("ZERO");
        service.addMovie("ZERO");
        service.addMovie("ZERO");
        String[] expected = {"ZERO", "ZERO", "ZERO","ZERO", "numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward"};
        String[] actual = service.showAddedMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_four() {
        PosterManager service = new PosterManager(0);
        service.addMovie("ZERO");
        String[] expected = {"ZERO"};
        String[] actual = service.showAddedMovies();
        assertArrayEquals(expected, actual);
    }

}

