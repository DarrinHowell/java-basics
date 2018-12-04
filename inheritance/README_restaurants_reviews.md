# Restaurant and Review Libraries
In the culinary business, visibility is essential to gaining more customers and growing one's
reputation. The restaurant and review libraries are simple classes that could be further 
developed to parallel the work that Yelp is doing in keeping a repository of restaurants with
all of their associated details and ratings. 


## Overview
The Restaurant class contains the following fields to store information about each
specific restaurant instance: name, star rating, price category, and a list of reviews.
Restaurants have a suite of instance methods that can be performed to get restaurant information
and to cast the average number of stars to strings for string concatenation. One key method is the 
addReview method. This method adds reviews to that restaurant instances reviewList field, 
subsequently updating the average number of stars. <br/>

The Review class contains the folowing fields to store information about each specific review
instance: a review body, an author, and number of stars. The Review class also consists of 
simple getters and to string methods to access the private number of stars field and to
turn those numbers into strings for string concatenation.<br/>

## Testing Code
To test this code, one should first test the toString methods to see if one can successfully
access the average stars / number of stars in the restaurant and review instance respectively. <br/>

After testing the toString methods, one should instantiate a new restaurant and check to see
if the average number of stars matches an expected average after adding one or mulitple reviews. 
Additionally, one should test to see that the average doesn't change after submitting the
same review twice. 