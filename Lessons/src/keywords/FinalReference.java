package keywords;
/*
For a final reference variable you cannot change what object it refers to. You can, however, modify the object itself.
 */
public class FinalReference {

        public static void main( String args[] ) {

            final Reference example = new Reference(); //declaration
            example.value = 6; // Modifying the object creates no disturbance
            System.out.println("Value:"+example.value);

          //  Reference another = new Reference();
           // example = another; // Attempting to change the object it refers to, creates an error

        }

}
class Reference{
    public int value = 5;
}