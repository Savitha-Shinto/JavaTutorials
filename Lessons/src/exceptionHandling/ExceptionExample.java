package exceptionHandling;
/*
* * Exceptions : An Exception “indicates conditions that a reasonable application might want to catch.”
Exceptions are the conditions that occur at runtime and may cause the termination of program.
* But they are recoverable using try, catch and throw keywords.
* Exceptions are divided into two catagories : checked and unchecked exceptions.
* Checked exceptions like IOException known to the compiler at compile time
* while unchecked exceptions like ArrayIndexOutOfBoundException known to the compiler at runtime.
* It is mostly caused by the program written by the programmer.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {
    //RuntimeException
    public static void main (String args[]) {
//        int a[] = new int[2];
//        try {
//            System.out.println("Access element three :" + a[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown :" + e);
//        } finally {
//            a[0] = 6;
//            System.out.println("First element value: " + a[0]);
//            System.out.println("The finally statement is executed");
//        }
//
//        //Arthematic exception
//        try {
//            int divideByZero = 5 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException => " + e);
//            System.out.println("ArithmeticException => " + e.getMessage());
//        } finally {
//            System.out.println("Finally block is always executed");
//        }

        //Throw and Custom Exception
        ExceptionExample exceptionExample = new ExceptionExample();
        try {
            exceptionExample.useMyException();
        } catch (MyException e) {
            System.out.println("Custom Exception => " + e.getMessage());
        }


    }
    public void checkedException() throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }

    public void useMyException() throws MyException {
        int a[] = new int[2];
        try {
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            MyException myException = new MyException("Array size is small.");
            throw myException;
        }

    }
}
