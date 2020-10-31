package Lesson3;
//Instance Variables
//        Instance variables are declared in a class, but outside a method, constructor or any block.
//        Instance variables are created when an object is created with the use of the keyword 'new'
//        and destroyed when the object is destroyed.
//        Instance variables can be declared in class level before or after use.
//        Access modifiers can be given for instance variables.
//        The instance variables are visible for all methods, constructors and block in the class.
//        Normally, it is recommended to make these variables private (access level). However,
//        visibility for subclasses can be given for these variables with the use of access modifiers.
//        Instance variables have default values. For numbers, the default value is 0,
//        for Booleans it is false, and for object references it is null.
//        Values can be assigned during the declaration or within the constructor.
//        Instance variables can be accessed directly by calling the variable name inside the class.
//        However, within static methods (when instance variables are given accessibility),
//        they should be called using the fully qualified name. ObjectReference.VariableName.

public class InstanceVariableExample {
    public static void main(String args[]) {
        Employee empOne = new Employee("Savi");
        empOne.setSalary(1000);
        String empName = empOne.name;

        System.out.println("Lesson3.Employee Name:  " + empName );
        System.out.println("Lesson3.Employee Salary:  " + empOne.getSalary() );
        empOne.printEmp();
    }
}

 class Employee {
     // this instance variable is visible for any child class.
     public String name;
     // salary  variable is visible in Lesson3.Employee class only.
     private double salary;

     // The name variable is assigned in the constructor.
     public Employee(String empName) {
         name = empName;
     }

     // The salary variable is assigned a value.
     public void setSalary(double empSal) {
         salary = empSal;
     }


     // The salary variable is assigned a value.
     public double getSalary() {
         return salary;
     }

     // This method prints the employee details.
     public void printEmp() {

         System.out.println("name  : " + name);
         System.out.println("salary :" + salary);
     }


 }