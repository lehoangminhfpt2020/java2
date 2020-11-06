package Lad1Arraylist;

import java.util.ArrayList;
import java.util.List;

public class VD1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("tiger");
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // thêm elephant vào vị trí thứ 3
        animals.add(2,"elephant");
        System.out.println(animals);
    }
}
