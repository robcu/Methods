/**
 * Created by robculclasure on 1/30/17.
 * Class Furniture represents items of furniture that a user may list for sale on craigslist.
 */
public class Furniture {

    Double furniturePrice;
    String furnitureName;
    Boolean isAntique;  //By chance this is a very useful way to name a boolean. Look at the getter code.
    Boolean isFormal;

    public Double getFurniturePrice() {
        return furniturePrice;
    }
    public void setFurniturePrice(Double furniturePrice) {
        this.furniturePrice = furniturePrice;
    }

    public String getName() {
        return furnitureName;
    }
    public void setName(String furnitureName) {
        if(furnitureName.isEmpty()){
            this.furnitureName = "unnamed furniture item";
        }
        else{
            this.furnitureName = furnitureName;
        }
    }

    public Boolean getAntique() {
        return isAntique;
    }
    public void setAntique(Boolean antique) {
        isAntique = antique;
    }

    public Boolean getFormal() {
        return isFormal;
    }
    public void setFormal(Boolean formal) {
        isFormal = formal;
    }


    Furniture(String furnitureName, Double furniturePrice, Boolean isAntique, Boolean isFormal ) {
        setName(furnitureName);
        setFurniturePrice(furniturePrice);
        setAntique(isAntique);
        setFormal(isFormal);
    }


    public static void main(String[] args) {

        Furniture item1 = new Furniture("couch", 12.00, true, true);

        System.out.println("The " + item1.getName() + " costs $" + item1.getFurniturePrice() + ".");

        if(item1.getFurniturePrice() > 15.0){
            System.out.println("Sorry, you cannot afford the " + item1.getName() + ".");
        }
        else{
            System.out.println("Congratulations! You've been approved to purchase the " + item1.getName() + ".");
        }
    }


}
