public class RestaurantRunner {

    public static void main(String[] args){

//        Restaurant newRestaurant = new Restaurant("Seol Food", 5,"$$");
//
//        Review testReview = new Review("So, so good.", "D$", 8);
//
//        System.out.println("This is the avg numStars before the review: " + newRestaurant.toString());
//
//        newRestaurant.addReview(testReview);
//
//        System.out.println("This is the avg numStars after the review: " + newRestaurant.toString());
//
//        Review testReview2 = new Review("Don't get me started.", "D$", 18);
//
//        newRestaurant.addReview(testReview2);
//
//        System.out.println("This is the avg numStars after the review: " + newRestaurant.toString());

        Shop testShop = new Shop("nordstroms", "high-end retail");
        Shop testShop2 = new Shop("foot-locker", "shoe store");
        Shop testShop3 = new Shop("REI", "outdoor retail");

        System.out.println(testShop);

        System.out.println();


        Review shopReview1 = new Review("amazing quality", "D$", 1.0);
        Review shopReview2 = new Review("amazing quality", "D$", 8.0);
        Review shopReview3 = new Review("amazing quality", "D$", 10.0);
        Review shopReview4 = new Review("amazing quality", "D$", 5.0);

        testShop2.addReview(shopReview1);
        testShop2.addReview(shopReview2);
        testShop2.addReview(shopReview3);
        testShop2.addReview(shopReview4);

        System.out.println("this is the avg num stars for testShop2: " + testShop2.getReview());



    }
}
