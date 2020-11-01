package keywords;
/*
1.  Using the final keyword means that the value can’t be modified in the future.
2. Final cal=n be used in Variable, methods, parameters and classes
3. If a variable is declared with the final keyword, its value cannot be changed once initialized
 */
public class FinalVariable {
    public static void main ( String args[]){
        //FinalClass finalClass = new FinalClass(6);
        FinalClass finalClass = new FinalClass();
        System.out.println("Final Variable finalInt:"+ finalClass.getFinalVariable());
    }
}
class FinalClass{
    final int finalInt =7;
    FinalClass(){

    }
    FinalClass(int i) {

      //  finalInt = i;
      //  System.out.println("Final Variable finalInt:"+ finalInt);
    }
    public int getFinalVariable(){
      //  finalInt= finalInt +1;
        return finalInt;
    }
}