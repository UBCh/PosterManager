package domain;

public class PosterManager {
    public String title;
    private int lengthReturn;
    private int j;
    String[] poster = {"bloodshot", "forward", "hotelBelgrade", "gentlemen", "InvisibleMan", "trollsWorldTour", "numberOne"};

    public PosterManager(int lengthReturn) {
        this.lengthReturn = lengthReturn;
    }

    public PosterManager() {

    }

    public String[] getPoster() {
        return poster;
    }


    public String[] addMovie(String title) {
        String[] tmp = new String[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = title;

        poster = tmp;
        return poster;
    }

    public String[] showAddedMovies() {

        if (lengthReturn > 10) {
            lengthReturn = 10;
        }
        if (lengthReturn > poster.length) {
            lengthReturn = poster.length;
        }
        if (lengthReturn < 1) {
            lengthReturn = 1;
        }
        int refund = 0;
        String[] tmp = new String[lengthReturn];
        if (poster.length < 10) {
            refund = poster.length;
        }
        if (poster.length > 10) {
            refund = lengthReturn;
        }
        if (lengthReturn == 1) {
            tmp[0] = poster[poster.length - 1];
        }
        int indexTo = 0;
        for (int indexFrom = 0; indexFrom < lengthReturn; indexFrom++) {
            tmp[indexTo] = poster[refund - (indexTo + 1)];
            indexTo++;
            if (indexTo == refund) break;
        }
        return tmp;
    }
}






