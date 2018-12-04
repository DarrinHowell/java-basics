public class RestaurantRunner {

    public static void main(String[] args){

        Restaurant newRestaurant = new Restaurant("Seol Food", 5,"$$");

        Review testReview = new Review("So, so good.", "D$", 8);

        System.out.println("This is the avg numStars before the review: " + newRestaurant.toString());

        newRestaurant.addReview(testReview);

        System.out.println("This is the avg numStars after the review: " + newRestaurant.toString());

        Review testReview2 = new Review("Don't get me started.", "D$", 18);

        newRestaurant.addReview(testReview2);

        System.out.println("This is the avg numStars after the review: " + newRestaurant.toString());



    }
}
