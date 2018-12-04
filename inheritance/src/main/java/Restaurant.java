
import java.util.*;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Restaurant {
    private String name;
    private int avgNumStars; // each restaurant starts with a star rating given by a client
    // (aka they all go through soft openings)
    private String priceCategory;
    private List<Review> reviewList;

    public Restaurant(String name, int numStars, String priceCategory) {
        this.name = name;
        this.avgNumStars = numStars;
        this.priceCategory = priceCategory;
        this.reviewList = new ArrayList<>();

    }


    public String toString() {
        String starsStringified = Integer.toString(this.avgNumStars);

        return starsStringified;
    }


    public int getStars() {
        return this.avgNumStars;
    }


    // method adds a review to the restaurant field reviewList and then finds the average
    // stars (the restaurant hits the market with an initial rating after its soft opening --> aka
    // set by the client when the object is instantiated.
    public void addReview(Review newReview) {

        if (!this.reviewList.contains(newReview)) {
            this.reviewList.add(newReview);

            int sumStars = 0;
            for (Review review : this.reviewList) {
                sumStars += review.getStars();
            }

            int newAvg = (sumStars + this.avgNumStars) / (this.reviewList.size() + 1);
            this.avgNumStars = newAvg;

        }

    }

}
