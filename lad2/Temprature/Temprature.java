package java2.lad2.Temprature;

import java.util.List;
import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        int day;
        int i;
        int j=0 ;
        float sum=0;
        float average;
        System.out.println("How many day' temperratures?");
        System.out.println("enter number: ");
        Scanner scanner= new Scanner(System.in);
        day = scanner.nextInt();
        int[] temp = new int[day];
        for (i=1; i< temp.length+1; i++ ){
            System.out.println("Day" + i + "\' hight temp: ");
            temp[i-1] = scanner.nextInt();
            sum += temp[i-1];
        }

        average = sum/day;

        for (i=0;i < temp.length; i++){
            if (temp[i] > average){
                j += 1;
            }
        }
        System.out.println("Average = "+ average +".");
        System.out.println(j+ " days above average");
    }
}
