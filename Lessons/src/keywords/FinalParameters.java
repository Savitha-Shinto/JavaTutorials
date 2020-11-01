package keywords;
/*
If you ever see the final keyword with a parameter variable, it means that the value of this variable cannot be changed anywhere in the function.
 */
public class FinalParameters {
    public static void main(String args[]){
        FinalParameterExamples.example(6);

    }
}
class FinalParameterExamples {
    public static void example( final int parameter ) {

  //      parameter = 4; //attempting to reassign a value to a parameter throws an error
    System.out.println(parameter);
    }
}