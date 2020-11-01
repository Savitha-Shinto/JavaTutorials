package keywords;
/*
A class​ declared as a final class, cannot be subclassed


 */

final class FinalClassExamples {
    String getName(){
        System.out.println("HelloWorld");
        return "HelloWorld";
    }
}
//class Subclass extends FinalClassExamples{ //attempting to subclass a final class throws an error
//
//}