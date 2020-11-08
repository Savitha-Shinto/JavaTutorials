package oops;
/*
Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds
together code and the data it manipulates.Other way to think about encapsulation is, it is a protective
shield that prevents the data from being accessed by the code outside this shield.
Technically in encapsulation, the variables or data of a class is hidden from any other class
and can be accessed only through any member function of own class in which they are declared.
As in encapsulation, the data in a class is hidden from other classes using the data hiding concept
which is achieved by making the members or methods of class as private and the class is exposed to the
end user or the world without providing any details behind implementation using the abstraction concept,
so it is also known as combination of data-hiding and abstraction..
Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public
methods in the class to set and get the values of variables.
 */
class Car{
    //Plastic & Aluminum
    public String radiatorTypes;

    private int temperature;

    private boolean thermostatBlock;

    private String carBrand;


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public boolean isThermostatBlock() {
        return thermostatBlock;
    }

    public void setThermostatBlock(boolean thermostatBlock) {
        this.thermostatBlock = thermostatBlock;
    }


    public String getRadiatorTypes() {

        return radiatorTypes;
    }

    public void setRadiatorTypes(String radiatorTypes) {
        this.radiatorTypes = radiatorTypes;
        if(temperature >= 50){
            setThermostatBlock(true);
            System.out.println("Radiator is too hot. Dont Touch it now.");
        }
        else  if(temperature >= 20 && temperature <= 50){
            setThermostatBlock(true);
            System.out.println("Radiator temperature is moderate. Change the Radiator after 20 minutes. Turn off the car now.");
        } else  if(temperature == 0){
            setThermostatBlock(false);
            System.out.println("Radiator temperature is cold. Can change the Radiator");
        }

    }
}

public class EncapsulationMechanic{
    public static void main(String args[]){
        Car mini = new Car();
        mini.setCarBrand("Mini");
        mini.setTemperature(65);
        System.out.println(mini.getCarBrand());
        mini.setRadiatorTypes("Plastic");

        Car bmwx4 = new Car();
        bmwx4.setTemperature(0);
        bmwx4.setCarBrand("BMW  X4");
        System.out.println(bmwx4.getCarBrand());
        bmwx4.setRadiatorTypes("Alumium");

        Car ford = new Car();
        ford.setTemperature(30);
        ford.setCarBrand("Ford");
        System.out.println(ford.getCarBrand());
        ford.setRadiatorTypes("Alumium");
    }
}
