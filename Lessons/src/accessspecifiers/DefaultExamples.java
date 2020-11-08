package accessspecifiers;

//If you don't use any modifier, it is treated as default by default.
//The default modifier is accessible only within package.
//It cannot be accessed from outside the package. It provides more accessibility than private.
//But, it is more restrictive than protected, and public.
public class DefaultExamples {
    public static void main(String args[]){
        DefaultAccessSpeiciferWithDiffPackageName obj = new DefaultAccessSpeiciferWithDiffPackageName();//Compile Time Error
        obj.msg();//Compile Time Error
        System.out.println( obj.addTwoNumbers(1, 2));
        ChildDefault childDefault = new ChildDefault();
        childDefault.msg();
    }
}
class DefaultAccessSpeiciferWithDiffPackageName {
     DefaultAccessSpeiciferWithDiffPackageName() {

    }
    void msg(){System.out.println("Hello");}
    int addTwoNumbers(int a, int b){
        return a+b;
    }
}

class ParentDefault{
     void msg()
    {
        System.out.println("i am parent");
    }
}


class ChildDefault extends ParentDefault{

}