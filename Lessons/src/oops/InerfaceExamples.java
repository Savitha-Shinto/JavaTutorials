package oops;
/*Interfaces specify what a class must do and not how. It is the blueprint of the class.
Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
It is also used to achieve loose coupling.
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
* */

interface Ipurchase{
    void purchase();
}


class Woman implements Ipurchase{
    @Override
    public void purchase() {
        System.out.println("Women purchased a beautiful dress");
    }
}


class Man implements Ipurchase {
    @Override
    public void purchase() {
        System.out.println("Man purchased a delicious chocolate");
    }
}

public class InerfaceExamples {
    public static void main (String args[]){
        Woman woman = new Woman();
        woman.purchase();
        Man man = new Man();
        man.purchase();
    }

}
