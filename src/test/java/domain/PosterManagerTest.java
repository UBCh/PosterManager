package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

    PosterManager service = new PosterManager();

    {
    }

    @Test
    public void shouldGetPoster() {
        PosterManager service = new PosterManager();
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};
        String[] actual = service.getPoster(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetLengtReturn() {
        int expected = 20;
        int actual = service.setLengtReturn(20);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        PosterManager service = new PosterManager();
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne", "ZERO"};
        String[] actual = service.addMovie("ZERO", poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesOne() {
        PosterManager service = new PosterManager(5);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesTwo() {
        PosterManager service = new PosterManager(10);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesThree() {
        PosterManager service = new PosterManager(11);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesFour() {
        PosterManager service = new PosterManager(0);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesFive() {
        PosterManager service = new PosterManager(21);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne", "ZORRO", "ZORRO", "ZORRO", "ZORRO", "ZORRO"
        };
        String[] expected = {"ZORRO", "ZORRO", "ZORRO", "ZORRO", "ZORRO", "numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMovieSix() {
        PosterManager service = new PosterManager(1);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"numberOne"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAddedMoviesReturn() {
        PosterManager service = new PosterManager(10);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"ZERO", "numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies(service.addMovie("ZERO", poster));
        assertArrayEquals(expected, actual);
    }
}

