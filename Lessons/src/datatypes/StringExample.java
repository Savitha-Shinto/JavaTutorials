package datatypes;

public class StringExample {
    public static void main(String args[]) {


        String string5 = "Hello";
//        String string6= "Hello";
//        if(string5 == string6){
//            System.out.println("Strings are same");
//        }
//        if(string5.equals(string6)){
//            System.out.println("Strings are same");
//        }
        String string7 = new String("Hello");
        if(string5 == string7){
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }

        if(string5.equals(string7)){
            System.out.println("Strings are same");
        }

//        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
//        String helloString = new String(helloArray);
//        System.out.println( helloString );
//        String palindrome = "Dot saw I was Tod";
//        int len = palindrome.length();
//        System.out.println( "String Length is : " + len );
////Concatenation
//        String string1 = "Hello";
//        String string2 = "World";
//
//        String string3 = string1.concat(string2);
//        System.out.println( "String concatenation  : " + string3 );
//        String string4 = "saw I was ";
//        System.out.println("Dot " + string4 + "Tod");
    }
}
