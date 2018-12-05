import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String description;
    private double avgNumDollarSigns;
    private List<Review> reviewListShops;

    public Shop(String name, String description){
        this.name = name;
        this.description = description;
        this.avgNumDollarSigns = 0;
        this.reviewListShops = new ArrayList<>();
    }

    public double getReview(){
        return this.avgNumDollarSigns;
    }

    public String toString(){
        return "Shop " + this.name + " has " + this.avgNumDollarSigns + " dollar signs.";
    }

    public void addReview(Review review){

        if(!this.reviewListShops.contains(review)){
            this.reviewListShops.add(review);

            double sum = 0;
            for(Review specificReview: this.reviewListShops){
                sum += specificReview.getNumDollarSigns();
            }

            double newAvg = (sum) / (this.reviewListShops.size());

            this.avgNumDollarSigns = newAvg;
        }


    }


}
