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
        int refund = 0;


        if (poster.length < lengthReturn) {
            refund = poster.length;
        } else {
            refund = lengthReturn;
        }
        String[] tmp = new String[refund];
        int indexTo = 0;

        for (int indexFrom = 0; indexFrom < lengthReturn; indexFrom++) {
            tmp[indexTo] = poster[poster.length - (1 + indexTo)];
            indexTo++;
            if (indexTo == refund) break;
        }
        return tmp;
    }
}







