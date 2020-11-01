package accessspecifiers;
/*
Private Data members and methods are only accessible within the class
Class and Interface cannot be declared as private
If a class has private constructor then you cannot create the object of that class from outside of the class.
 */
public class PrivateExamples {
    public static void main(String args[]){

        PrivateInstantVariable obj=new PrivateInstantVariable();
//        System.out.println(obj.data);//Compile Time Error
//        obj.msg();//Compile Time Error
//        PrivateConstructorExample privateConstructorExample=new PrivateConstructorExample();
    }
}

class PrivateConstructorExample{
    private PrivateConstructorExample(){}
    private int data=40;
    private void msg()
    {System.out.println("Hello java");}
}

class PrivateInstantVariable{
    private int data=40;
    private void msg(){System.out.println("Hello java");}
}