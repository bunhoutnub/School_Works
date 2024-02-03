package Project2.Project2;
/**
 * Class representing a FrozenYogurt object
 *  @author Bunhout Nub
 * @version 0.1 (Feb 1, 2024)
 */

//class that represent FrozenYogurt object
public class FrozenYogurt {
    //Private fields to store frozen yogurt details
    private String name; 
    private double price;
    private String yogurtFlavor;
    private String topping;

    //Constructor with parameters
    public FrozenYogurt(String name, double price, String yogurtFlavor, String topping) {
        this.name = name;
        this.price = price;
        this.yogurtFlavor = yogurtFlavor;
        this.topping = topping;
    }
    //Default constructor
    public FrozenYogurt(){
        name = "";
        price = 0.0;
        yogurtFlavor = "";
        topping = "";
    }
    //Setter method to set the name of the frozen yogurt
    public void setName(String name){
        this.name = name;
    }
    //Getter method to get the name of the frozen yogurt
    public String getName(){
        return name;
    }
    //Setter method to set the price of the frozen yogurt
    public void setPrice(double price){
        this.price = price;
    }
    //Getter method to get the name of the frozen yogurt
    public double getPrice(){
        return price;
    }
    //Setter method to set the flavor of the frozen yogurt
    public void setYogurtFlavor(String yogurtFlavor){
        this.yogurtFlavor = yogurtFlavor;
    }
    //Getter method to get the flavor of the frozen yogurt
    public String getYogurtFlavor(){
        return yogurtFlavor;
    }
    //Setter method to set the topping of the frozen yogurt
    public void setTopping(String topping){
        this.topping = topping;
    }
    //Getter method to get the topping of the frozen yogurt 
    public String getTopping(){
        return topping;
    }
    //Method returns string that represent the description of the frozen yogurt
    public String description(){
        return "Frozen Yogurt : "+name+"\n"+ 
                "Price         : "+price+"\n"+
                "Yogurt        : "+yogurtFlavor+"\n"+
                "Topping       : "+topping+"\n";
    }
}
