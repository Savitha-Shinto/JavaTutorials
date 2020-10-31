package variables;
//Class/Static Variables
//        Class variables also known as static variables are declared with the static keyword in a class,
//        but outside a method, constructor or a block.
//        There would only be one copy of each class variable per class, regardless of how many objects are created from it.
//        Static variables are rarely used other than being declared as constants. Constants are variables
//        that are declared as public/private, final, and static. Constant variables never change from their initial value.
//        Static variables are created when the program starts and destroyed when the program stops.
//        Static variables can be accessed by calling with the class name ClassName.VariableName.
public class StaticVariable {

    public static void main(String args[]) {
        Payroll p = new Payroll();
        Payroll p1 = new Payroll();
        System.out.println(Payroll.DEPARTMENT + "average salary:" + Payroll.getSalary());
    }

}
class Payroll {
    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";
    public static double getSalary(){
        return 1000;
    }
}
