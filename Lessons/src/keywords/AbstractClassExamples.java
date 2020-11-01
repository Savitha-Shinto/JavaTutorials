package keywords;
/*
A Java abstract class is a class which cannot be instantiated,
 meaning you cannot create new instances of an abstract class.
 The purpose of an abstract class is to function as a base for subclasses.
 1)  Now you cannot create instances
 MyAbstractClass myClassInstance =
    new MyAbstractClass();  //not valid
 2) An abstract class can have abstract methods. You declare a method abstract by adding the abstract keyword in front of the method declaration.
 An abstract method has no implementation. It just has a method signature. Just like methods in a Java interface.
 If a class has an abstract method, the whole class must be declared abstract
  An abstract class can have a mixture of abstract and non-abstract methods.

*important* 3) The only time a subclass of an abstract class is not forced to implement all abstract methods of its superclass, is if the subclass is also an abstract class.


Subclasses of an abstract class must implement (override) all abstract methods of its abstract superclass
 */
public  class AbstractClassExamples extends MyAbstractClass {
    public void abstractMethod() {
        System.out.println("My method implementation");
    }

}
abstract class MyAbstractClass {
    public abstract void abstractMethod();
}
class MyAbstractClassBootstrap {
    public static void main(String args[]){
        AbstractClassExamples abstractClassExamples = new AbstractClassExamples();
        abstractClassExamples.abstractMethod();
    }
}