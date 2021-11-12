package domain;

public class PosterManager {
    private String title;
    private int lengthReturn;
    private final int maxReturn = 10;
    private String[] poster;

    public PosterManager(int lengthReturn) {
        this.lengthReturn = lengthReturn;
    }

    public PosterManager() {
    }


    public String[] getPoster(String[] poster) {
        return poster;
    }


    public String[] addMovie(String title, String[] poster) {
        String[] tmp = new String[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = title;

        poster = tmp;
        return poster;
    }

    public String[] showAddedMovies(String[] poster) {

        if (lengthReturn > maxReturn) {
            lengthReturn = maxReturn;
        }
        if (lengthReturn > poster.length) {
            lengthReturn = poster.length;
        }

        if (lengthReturn < 1) {
            lengthReturn = 1;
        }
        int refund = 0;
        String[] tmp = new String[lengthReturn];

        if (poster.length < maxReturn) {
            refund = poster.length;
        }
        if (poster.length > lengthReturn) {
            refund = lengthReturn;
        }
        if (lengthReturn == 1) {
            tmp[0] = poster[poster.length - 1];
        }

        int indexTo = 0;
        // @codeCoverageIgnoreStart
        for (int indexFrom = 0; indexFrom < lengthReturn; indexFrom++)
        // @codeCoverageIgnoreEnd
        {
            tmp[indexTo] = poster[poster.length - (1 + indexTo)];
            indexTo++;
            if (indexTo == refund) break;
        }
        return tmp;
    }
}






