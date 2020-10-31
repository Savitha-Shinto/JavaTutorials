package variables;
//Local variables
//        Local variables are declared in methods, constructors, or blocks.
//        Local variables are created when the method, constructor
//        or block is entered and the variable will be destroyed once
//        it exits the method, constructor, or block.
//        Access modifiers cannot be used for local variables.
//        Local variables are visible only within the declared method, constructor, or block.
//        There is no default value for local variables, so local variables should be declared
//        and an initial value should be assigned before the first use.

public class LocalVariable {

    public static void main(String args[]) {
        Puppy puppy = new Puppy();
        int puppyage =  puppy.pupAge();

        System.out.println("My puppy age is : " + puppyage);
    }

}

class Puppy {

    public int pupAge() {
        int age=0;
        age = age + 7;
        return age;
    }
}