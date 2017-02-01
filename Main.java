public class Main {

    public static void main(String[] args) {

        //Testing the furniture class. The conditional checks to see if the name is an empty string.
        Furniture item1 = new Furniture("couch", 19.99, true, true);
        System.out.println("Furniture Class:");
        System.out.println("The " + item1.getName() + " costs $" + item1.getFurniturePrice() + ".\n" );


        //Testing the Vehicle class. (The conditional checks that: 1990 <= modelYear <= 2017 and prints accordingly.
        System.out.println("Vehicle Class:");
        Vehicle vehicle1 = new Vehicle("Honda", "Civic", 2019);


        //Testing the Building class. Tests for commercial status and prints accordingly.
        System.out.println("Building Class:");
        Building building1 = new Building("Rhythm", true, true, true);


        //Testing the Pizza Class. Tests for dayOfWeek to determine which advertisement to print.
        System.out.println("Pizza Class:");
        Pizza pizza1 = new Pizza(1, 9.99, "Veggie Supreme", "small");


        //Testing the Beverage Class. Tests for diet status and prints accordingly.
        System.out.println("\nBeverage Class");
        Beverage beverage1 = new Beverage("Ginger Ale", false, 12, 14);
    }
}
