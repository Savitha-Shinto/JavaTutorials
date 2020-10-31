package constructors;

  class ConsDemo {
    public static void main(String args[])
    {
        Dog bichonFrise = new Dog();
        Dog labrador = new Dog();
        System.out.println("Number of legs for Bichon Frise : " + bichonFrise.noOfLegs + ", Number of legs for Labrador :" + labrador.noOfLegs);
    }
}

class Dog {
    int noOfLegs;
    Dog()
    {
        noOfLegs = 4;
    }
}

class Car {
    int noOfWheels;
    Car()
    {
        noOfWheels = 4;
    }
}