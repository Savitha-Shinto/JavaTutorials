package oops;

/*
An abstract class is a class that is declared with abstract keyword.
An abstract method is a method that is declared without an implementation.
An abstract class may or may not have all abstract methods. Some of them can be concrete methods
A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
Any class that contains one or more abstract methods must also be declared with abstract keyword.
There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
An abstract class can have parametrized constructors and default constructor is always present in an abstract class.
 */
abstract class CarInternalProcess {
//common
    String carType;
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    void startEngine() {
        System.out.println(getCarType() + " car");
        if(isEngineStarted() && isCheckFuel() ) {
            moveWheels();
        }
    }
    boolean isEngineStarted(){
        System.out.println("Check Engine is started");
        System.out.println("Engine is started: Yes");

        return true;
    }
    void moveWheels(){
        System.out.println("Engine makes starting sound");
        System.out.println(getCarType() + " Wheels starts moving");
    }
    void steeringWheelTurnMakesMoveTheCarWheels() {
        if(getCarType().equals("Electric")) {
            System.out.println( "Step 1 : Electric motor and computer modules makes Steering Columns rotates");
            System.out.println( "Step 2 : Pinion System moves");
            System.out.println( "Step 3 : Rack moves");
            System.out.println( "Step 4 : Wheels rotates");
        } else {
            System.out.println("Step 1 : Hydraulic system makes Steering Columns rotates");
            System.out.println("Step 2 : Pinion System moves");
            System.out.println("Step 3 : Rack moves");
            System.out.println("Step 4 : Wheels rotates");
        }

    }
//uncommon
    abstract boolean isCheckFuel();
    abstract void turnSteeringWheel();
}

class ElectricCar extends CarInternalProcess {

    @Override
    boolean isCheckFuel() {
        System.out.println( "Check Engine Battery level");
        System.out.println( "Engine Battery check is OK");
        return true;
    }

    @Override
    void turnSteeringWheel() {
        steeringWheelTurnMakesMoveTheCarWheels();
        System.out.println( "Car moves");
    }

    @Override
    void moveWheels(){
        System.out.println("Engine makes Electric sound");
    }

    int getAge() {
        return 45;
    }
}

class PetrolCar extends CarInternalProcess {
    @Override
    boolean isCheckFuel() {
        System.out.println( "Check Engine fuel level");
        System.out.println( "Engine fuel check is OK");
        return true;
    }

    @Override
    void turnSteeringWheel() {
        steeringWheelTurnMakesMoveTheCarWheels();
        System.out.println( "Car moves");
    }
}

public class AbstractionCar{
    public static void main(String args[]){

//        System.out.println("------------------------------------------");
//        System.out.println("Car process using abstraction.");
//        ElectricCar electricCar = new ElectricCar();
//        electricCar.setCarType("Electric");
//        electricCar.startEngine();
//        electricCar.turnSteeringWheel();
//        System.out.println("------------------------------------------");


        System.out.println("NEXT CAR");
        System.out.println("------------------------------------------");
        PetrolCar petrolCar = new PetrolCar();
        petrolCar.setCarType("Petrol");
        petrolCar.startEngine();
        petrolCar.turnSteeringWheel();
        System.out.println("------------------------------------------");
    }
}