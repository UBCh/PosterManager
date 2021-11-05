package domain;

public class PosterManager {
    public String title ;
    private int lengthReturn ;
    String [] poster = {"bloodshot","forward","hotelBelgrade","gentlemen","InvisibleMan","trollsWorldTour","numberOne"};

    public PosterManager(String title, int lengthReturn) {
        this.title = title;
        this.lengthReturn = lengthReturn;
    }

    public String[] getPoster() {
        return poster;
    }


    public String[] addMovie () {
        String[] tmp = new String[poster.length+1];
          for (int i=0; i< poster.length; i++ ) {
            tmp[i]= poster[i]; }
                  tmp [tmp.length-1] = title;
               poster = tmp;
               return poster;
    }

    public String[] showAddedMovies () {
        String[] tmp = new String[lengthReturn];
        int indexTo = 0;
           for (int indexFrom = 0; indexFrom < lengthReturn; indexFrom++) {
            tmp[indexTo]= poster[poster.length - indexTo];
            indexTo++;
            if (indexTo == lengthReturn) break;}
                       return tmp ;
    }
    }






