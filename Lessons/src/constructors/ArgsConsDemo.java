package constructors;

public class ArgsConsDemo {
    public static void main(String args[]) {

        Vehicles car = new Vehicles();
        Vehicles auto = new Vehicles( 3 , "Black");
        Vehicles bike = new Vehicles(2);

        System.out.println("Number of wheels in Car is " + car.noOfWheels + ", color " + car.color);
        System.out.println("Number of wheels in Auto is " + auto.noOfWheels + ", color " + auto.color);
        System.out.println("Number of wheels in bike is " + bike.noOfWheels + ", color " + bike.color);

    }

}
class Vehicles {
    int noOfWheels=4; // Following is the constructor
    String color="Red";
    Vehicles(){
        System.out.println("Object is constructed");
    }
    Vehicles(int noofwheels) {
        noOfWheels = noofwheels;
    }
    Vehicles(int noofwheels, String color) {
        noOfWheels = noofwheels;
        this.color = color;
    }
}
