import java.time.LocalDateTime;

public class FridgeBuddy {
    
    public static void main(String args[]){
        FoodItem test = new FoodItem("Orange", LocalDateTime.now().plusMinutes(20));
        System.out.println(test);
    }

}
