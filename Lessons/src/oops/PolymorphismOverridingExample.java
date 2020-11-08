package oops;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {

}

class Dog extends Animal {

    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Cow extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The cow says: moo moo");
    }
}

    public class PolymorphismOverridingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myCat = new Cat();  // Create a cat object
        Animal myDog = new Dog();  // Create a Dog object
        Animal myCow = new Cow();  // Create a cow object
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
        myCow.animalSound();
    }
}