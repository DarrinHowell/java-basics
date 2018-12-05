public class Review {
    private String body;
    private String author;
    private int numStars;

    // adding functionality for shops
    private double numDollarSigns;

    // adding functionality for Theaters specifying movies
    private String movieSeen;



    ///////////////////

    // constructor for adding reviews to Restaurants
    public Review(String body, String author, int numStars){
        this.body = body;
        this.author = author;
        this.numStars = numStars;
    }

    // constructor used for Shop reviews
    public Review(String body, String author, double numDollarSigns){
        this.body = body;
        this.author = author;
        this.numDollarSigns = numDollarSigns;
    }


    // constructor used to specify movie seen when adding a review
    public Review(String body, String author, int numStars, String movieSeen){
        this.body = body;
        this.author = author;
        this.numStars = numStars;
        this.movieSeen = movieSeen;
    }


    public String toString(){
        return Integer.toString(this.numStars);
    }

    public int getStars(){
        return this.numStars;
    }

    public double getNumDollarSigns(){
        return this.numDollarSigns;
    }

    public String getMovieSeen(){ return this.movieSeen;}


}
