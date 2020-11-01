package datatypes;
/*
There are three reasons that you might use a Number object rather than a primitive:

As an argument of a method that expects an object (often used when manipulating collections of numbers).
To use constants defined by the class, such as MIN_VALUE and MAX_VALUE, that provide the upper and lower bounds of the data type.
To use class methods for converting values to and from other primitive types, for converting to and from strings, and for converting between number systems (decimal, octal, hexadecimal, binary).
 */
public class Number {
     public static void main(String args[]) {
        Integer x = 5; // boxes int to an Integer object
        float y = 0.0f;
        Float g= 0.1f;

        x =  x + 10;   // unboxes the Integer to a int

        System.out.println(x);
    }
}
