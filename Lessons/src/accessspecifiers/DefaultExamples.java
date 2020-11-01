package accessspecifiers;

//If you don't use any modifier, it is treated as default by default.
//The default modifier is accessible only within package.
//It cannot be accessed from outside the package. It provides more accessibility than private.
//But, it is more restrictive than protected, and public.
public class DefaultExamples {
    public static void main(String args[]){
//        DefaultAccessSpeiciferWithDiffPackageName obj = new DefaultAccessSpeiciferWithDiffPackageName();//Compile Time Error
//        obj.msg();//Compile Time Error
    }
}
