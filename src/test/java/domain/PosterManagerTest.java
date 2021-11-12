package domain;

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
    public void addMovie() {
        PosterManager service = new PosterManager();
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne", "ZERO"};
        String[] actual = service.addMovie("ZERO", poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_one() {
        PosterManager service = new PosterManager(5);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_two() {
        PosterManager service = new PosterManager(10);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_three() {
        PosterManager service = new PosterManager(11);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade", "forward", "bloodshot"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_four() {
        PosterManager service = new PosterManager(0);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"numberOne"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_five() {
        PosterManager service = new PosterManager(11);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne", "ZORRO", "ZORRO", "ZORRO", "ZORRO", "ZORRO"
        };
        String[] expected = {"ZORRO", "ZORRO", "ZORRO", "ZORRO", "ZORRO", "numberOne", "trollsWorldTour", "InvisibleMan", "gentlemen", "hotelBelgrade"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAddedMovies_six() {
        PosterManager service = new PosterManager(1);
        String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"
        };
        String[] expected = {"numberOne"};
        String[] actual = service.showAddedMovies(poster);
        assertArrayEquals(expected, actual);
    }
}

