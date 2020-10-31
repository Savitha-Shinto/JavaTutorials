package sumofseries;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int number = Integer.parseInt(s.nextLine());
        int sum=0;
        for(int i=0;i<number; i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
