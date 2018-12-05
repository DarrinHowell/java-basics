public class Review {
    private String body;
    private String author;
    private int numStars;

    // adding functionality for shops
    private double numDollarSigns;

    public Review(String body, String author, int numStars){
        this.body = body;
        this.author = author;
        this.numStars = numStars;
    }

    public Review(String body, String author, double numDollarSigns){
        this.body = body;
        this.author = author;
        this.numDollarSigns = numDollarSigns;
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


}
