import java.util.List;

public class RestaurantRunner {

    public static void main(String[] args){

        Restaurant newRestaurant = new Restaurant("Seol Food", 5, "$$");

        Review testReview = new Review("So, so good.", "D$", 5);

        List<Review> DsReview = newRestaurant.updateReviewList(testReview);

        System.out.println("This is the numStars that D$ gave the review: " + DsReview.get(0).toString());


    }
}
