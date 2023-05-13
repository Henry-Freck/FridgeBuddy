import java.time.LocalDateTime;

public class FoodItem {
    private String name;
    private LocalDateTime expiration;
    private int quantity;
    //TODO will need to define units somehow
    //TODO how to handle non perishables


    //Constructors
    public FoodItem(String name, LocalDateTime expiration, int quantity){
        this.name = name;
        this.expiration = expiration;
        this.quantity = quantity;
    }
    //Assumes quantity of 1 if quantity is not Provided
    public FoodItem(String name, LocalDateTime expiration){
        this.name = name;
        this.expiration = expiration;
        this.quantity = 1;
    }

    //ToString method
    public String toString(){
        return String.valueOf(this.getQuantity()) + " " + this.getName() + " expires on " + this.getExpiration().toString();
    }

    //Getters and Setters
    public String getName(){
        return name;
    }
    public LocalDateTime getExpiration(){
        return expiration;
    }
    public int getQuantity(){
        return quantity;
    }

}
