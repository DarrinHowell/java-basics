public class Review {
    private String body;
    private String author;
    private int numStars;

    public Review(String body, String author, int numStars){
        this.body = body;
        this.author = author;
        this.numStars = numStars;
    }

    public String toString(){
        return Integer.toString(this.numStars);
    }

    public int getStars(){
        return this.numStars;
    }


}
