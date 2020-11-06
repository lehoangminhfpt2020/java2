package java2.lad2.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        System.out.println("Enter 5 interger values");
        for (int i=1; i< intArray.length+1; i++){
            System.out.println("enter No"+ i +  " Number: ");
            Scanner scanner= new Scanner(System.in);
            intArray[i-1]= scanner.nextInt();
        }

        double getAverage = 0;
        double sum =0;
         for (int i=1; i < intArray.length+1; i++){
             System.out.println(" Element " + (i-1) +", typed value was " + intArray[i-1]);
             sum += intArray[i-1];
         }
         getAverage = sum/5;

        System.out.println("Average is "+ getAverage);
    }
}
