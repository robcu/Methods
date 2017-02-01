/**
 * Created by robculclasure on 1/30/17.
 * Class Vehicle represents automobiles that a user would find for sale at carmax.com.
 * The variables allow users to sort vehicles by their attributes.
 */
public class Vehicle {

    public Integer modelYear;
    public String make;
    public String model;


    public Integer getModelYear() {
        return modelYear;
    }
    public void setModelYear(Integer modelYear) {
        if(modelYear >= 1990 && modelYear <= 2017){
            this.modelYear = modelYear;
            System.out.println("Pulling pricing data. Please wait... \n" );
        }
        else if(modelYear > 2017){
            System.out.println("Too new. Back to the future, eh? \n");
        }
        else{
            System.out.println("The vehicle is too old. It is not contained in the database. \n");
        }
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    Vehicle (String make, String model, Integer modelYear){
        setMake(make);
        setModel(model);
        setModelYear(modelYear);
    }

    public static void main(String[] args) {


     /*   Vehicle first = new Vehicle();
        first.make = "Toyota";
        first.model = "Corolla";
        first.numDoors = 4;
        first.modelYear = 1999;
        System.out.println("Congratulations on purchasing your " + first.modelYear + " " + first.make +
                " " + first.model + "!");
    */
    }
}
