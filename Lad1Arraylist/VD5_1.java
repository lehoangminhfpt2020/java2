package Lad1Arraylist;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VD5_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(123);
        numbers.add(31);
        numbers.add(2);
        System.out.println(numbers);

        Iterator<Integer> numberok = numbers.iterator();
        while (numberok.hasNext()){
            Integer num = numberok.next();
            if (num %2 !=0){
                numberok.remove();
            }
        }

        System.out.println(numbers);
    }
}
