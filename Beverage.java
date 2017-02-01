/**
 * Created by robculclasure on 1/30/17.
 * Class Beverage represents a beverage with some basic nutritional properties.
 */

public class Beverage {

    String name;
    boolean diet;
    int ounces;
    int caloriesPerOZ;

    Beverage(String name, boolean diet, int ounces, int caloriesPerOZ){
        setName(name);
        setDiet(diet);
        setOunces(ounces);
        setCaloriesPerOZ(caloriesPerOZ);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getOunces(){
        return ounces;
    }
    public void setOunces(int ounces){
        this.ounces = ounces;
    }

    public int getCaloriesPerOZ(){
        return caloriesPerOZ;
    }
    public void setCaloriesPerOZ(int caloriesPerOZ){
        this.caloriesPerOZ = caloriesPerOZ;
    }

    public boolean getDiet(){
        return diet;
    }
    public void setDiet(boolean diet) {
        this.diet = diet;
        if(diet == true){
            System.out.println("The user has selected a diet beverage.");
        }
        else{
            System.out.println("More for the lovin'.");
        }
    }

    /*
    public static void main(String[] args) {

        System.out.println("A " + OJ.ounces + " ounce " + OJ.name + " has " + OJ.caloriesPerOZ * OJ.ounces + " calories.");

    }
    */
}
