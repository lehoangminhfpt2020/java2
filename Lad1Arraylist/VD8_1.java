package Lad1Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VD8_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(56);
        numbers.add(4);
        numbers.add(32);
        numbers.add(1);

        System.out.println("Before: "+ numbers);

        Collections.sort(numbers);

        System.out.println("After: " + numbers);
    }
}
