package Lad1Arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VD8_2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println(names);

        // cách 1
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });

        names.sort((name1, name2) -> name1.compareTo(name2) );

        //cách 2

        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names : " + names);
    }
}
