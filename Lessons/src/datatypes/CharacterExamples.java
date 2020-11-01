package datatypes;
/*
1	isLetter()
Determines whether the specified char value is a letter.

2	isDigit()
Determines whether the specified char value is a digit.

3	isWhitespace()
Determines whether the specified char value is white space.

4	isUpperCase()
Determines whether the specified char value is uppercase.

5	isLowerCase()
Determines whether the specified char value is lowercase.

6	toUpperCase()
Returns the uppercase form of the specified char value.

7	toLowerCase()
Returns the lowercase form of the specified char value.

8	toString()
Returns a String object representing the specified character value that is, a one-character string.
 */
public class CharacterExamples {
    public static void main(String args[]) {
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
        Character x = 'a'; // boxes int to an Char object
        char c =    x;   // unboxes the char to a int
        System.out.println(x);
    }
}
