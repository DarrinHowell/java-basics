public class Main {
    public static void main(String[] args){
        String testPlural = pluralize("test", 1);
        System.out.println(testPlural);
    }

    // method takes in a string and an int and pluralizes that string
    // if the int is 0 or greater than 1
    public static String pluralize(String noun, int numNouns){

        // if numNouns == 0 OR numNouns > 1, then add an "s" to noun
        if(numNouns == 0 || numNouns > 1){
            noun += "s";
        }

        return noun;
    }
}
