package Lad1Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VD4 {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("initial List: " + programmingLanguages);

        // Remove the element at index `5` , delete Perl
        programmingLanguages.remove(5);
        System.out.println("After remove(5) now programmingLanguages is: " + programmingLanguages);

        boolean isRemoved = programmingLanguages.remove("C");
        System.out.println("After remove (\"C\") now programmingLanguages is: " + programmingLanguages);

        // khởi tạo 1 mảng danh sách có các phần tử Python, Ruby , Perl
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");
        System.out.println("scriptingLanguages: " +scriptingLanguages);

        //xóa các phần tử trong programmingLanguages giống với các phần tử có trong scriptingLanguages
        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages) now programmingLanguages is : " + programmingLanguages);

        // xóa các phần tử bắt đầu bằng "c"
        programmingLanguages.removeIf(s -> (s.startsWith("C")));
        System.out.println("After Removing all elements that start with \"C\" now programmingLanguages is: " + programmingLanguages);
        // xóa các phần tử bắt đầu bằng "J"
        programmingLanguages.removeIf(s -> (s.charAt(0) == 'J'));
        System.out.println("After Removing all elements that start with \"J\" now programmingLanguages is: " + programmingLanguages);

        // Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear() now programmingLanguages is: " + programmingLanguages);
    }
}
