import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String name;
    private List<String> moviesList;
    private int avgStars;
    private List<Review> reviewList;

    public Theater(String name){
        this.name = name;
        this.moviesList = new ArrayList<>();
        this.avgStars = 0;
        this.reviewList = new ArrayList<>();

    }

    public void addMovie(String movie){
        if(!this.moviesList.contains(movie)){
            this.moviesList.add(movie);
        }
    }

    public void removeMovie(String movie){
        if(this.moviesList.contains(movie)){
            this.moviesList.remove(movie);

        } else {
            System.out.println("Sorry, this movie is not in the list");
        }
    }

    public void addReview(Review review){

        if(!this.reviewList.contains(review)){
            this.reviewList.add(review);

            int sum = 0;
            for(Review specificReview: this.reviewList){
                sum += specificReview.getStars();
            }

            int newAvg = (sum) / (this.reviewList.size());

            this.avgStars = newAvg;

        }
    }

    public List<String> getMoviesList(){
        return this.moviesList;
    }

    public String toString(){
        return "Theater " + this.name + " has " + this.moviesList.size() + " movies playing.";
    }

    public int getAvgStars(){
        return this.avgStars;
    }
}
