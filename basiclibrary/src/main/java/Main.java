import java.util.Arrays;

// class that will run our library methods
public class Main {
    public static void main(String[] args){
//        System.out.println(Arrays.toString(Library.roll(8)));
//
//        System.out.println();
//
//        int[] testArr = {3, 4, 5, 6, 7, 8, 8};
//        System.out.println(Library.containsDuplicates(testArr));
//
//        System.out.println();
//
//        int[] testArr2 = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Library.averageFinder(testArr2));

        System.out.println();

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        Library.analyzeWeather(weeklyMonthTemperatures);


    }
}
