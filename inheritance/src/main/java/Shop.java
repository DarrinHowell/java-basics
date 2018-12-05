public class Shop {
    private String name;
    private String description;
    private String numDollarSigns;

    public Shop(String name, String description, String numDollarSigns){
        this.name = name;
        this.description = description;
        this.numDollarSigns = numDollarSigns;
    }

    public String toString(){
        return "Shop " + this.name + " has " + this.numDollarSigns + " price rating.";
    }
}
