
/**
 * Created by robculclasure on 1/30/17.
 *
 * Class Pizza represents a pizza with several possible sizes and corresponding prices.
 * The array is not helpful at this stage. A for loop would make it more interesting.
 *
 */
public class Pizza {
    double price;
    String size;
    String name;
    int dayOfWeek;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getDayOfWeek(){
        return dayOfWeek;
    }
    public void setDayOfWeek(int dayOfWeek){
        this.dayOfWeek = dayOfWeek;
        if(dayOfWeek == 2){
            System.out.println("Today all pizzas are 25% off!");
        }
        else{
            System.out.println("Come back on Monday for our Case of the Monday's discount.");
        }
    }

    Pizza(int dayOfWeek, double price, String name, String size){
        setDayOfWeek(dayOfWeek);
        setPrice(price);
        setName(name);
        setSize(size);
    }



    /* Code storage


    static String [][] priceChart = new String[3][2];

    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.priceChart[0][0] = "Small";
        pizza.priceChart[0][1] = "9.99";
        pizza.priceChart[1][0] = "Medium";
        pizza.priceChart[1][1] = "15.99";
        pizza.priceChart[2][0] = "Large";
        pizza.priceChart[2][1] = "24.99";

        System.out.println("Pizza prices");
        System.out.println(pizza.priceChart[0][0] + "  ---  $" + pizza.priceChart[0][1]);
        System.out.println(pizza.priceChart[1][0] + "  ---  $" + pizza.priceChart[1][1]);
        System.out.println(pizza.priceChart[2][0] + "  ---  $" + pizza.priceChart[2][1]);

        System.out.println("Your total is $" + pizza.priceChart[0][1] + ".");
    }
    */
}
