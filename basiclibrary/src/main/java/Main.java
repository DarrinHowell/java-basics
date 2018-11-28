import java.util.Arrays;

// class that will run our library methods
public class Main {
    public static void main(String[] args){
        System.out.println(Arrays.toString(Library.roll(8)));

        System.out.println();

        int[] testArr = {3, 4, 5, 6, 7, 8, 8};
        System.out.println(Library.containsDuplicates(testArr));

        System.out.println();

        int[] testArr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Library.averageFinder(testArr2));
    }
}
