package loopsAndArrays;
import java.lang.String;
import java.lang.Object;
public class loopExamples {
    public static void main(String args[]) {

     //   System.out.println("Sum:" + getSum());
//        forloop();
//        whileloop();
//        doWhileLoop();
//       switchexamples(15);
//       ifConditions(5);
 //       loopWithBreak();
        loopWithContinue();
    }

    public static int getSum(){

        return 9 + 9;

    }

    public static void forloop() {
       int number[] = new int[5];
//        number[0] =1;
//        number[1] =2;
//        number[2] =3;
//        number[3] =4;
//        number[4] =5;
//        int a =0;
//        int b=0;
//        System.out.println(++a);
//        System.out.println(b++);
        int i = 0;
        for( i = 0; i < number.length; i++){
            number[i] = i + 1;
            System.out.println(number[i]);
        }
        System.out.println(i);

        int[] numbers = {10, 20, 30, 40, 50, 60};
        for (int x : numbers) {
            i = i +1;
            System.out.print(x);
            System.out.print(",");
        }


        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
    }

    public static void whileloop() {
        int i = 0;
        while (i < 5) {
            System.out.println("index: " + i);
            i++;
            System.out.println("while loop count : " + i);
        }
    }

    public static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println("do while loop index: " + i);
            i++;
            System.out.println("do while loop count : " + i);
        }
        while (i < 5);
    }

    public static void switchexamples(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("NO MATCH");
        }
    }

    public static void ifConditions(int time) {

        if (time < 8) {
            returnMsg();
        } else if (time < 12) {
            System.out.println("Good day.");
        } else if (time < 17) {
            System.out.println("Good evening.");
        } else {
            System.out.println("Good night.");
        }
    }
public static void returnMsg(){
    System.out.println("Good morning.");
    System.out.println("Good morning.");
    System.out.println("Good morning.");
    System.out.println("Good morning.");
    System.out.println("Good morning.");
    System.out.println("Good morning.");System.out.println("Good morning.");
    System.out.println("Good morning.");
    System.out.println("Good morning.");
    System.out.println("Good morning.");
    System.out.println("Good morning.");System.out.println("Good morning.");
    System.out.println("Good morning.");
    System.out.println("Good morning.");
}
    public static void loopWithBreak() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        //While
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }

    public static void loopWithContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        //While
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
