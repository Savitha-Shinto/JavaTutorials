package keywords;

public class FinalMethods {
    public static void main(String args[]){
        Derived derived = new Derived();
        derived.finalMethod();

    }
}
class Derived extends Base{
//    public final void finalMethod() { //Overriding the final method throws an error
//        System.out.print("Derived");
//    }
}
// declaring a final method
class Base{

    public final void finalMethod(){
        System.out.print("Base");
    }

}