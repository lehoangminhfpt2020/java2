package Lad1Arraylist;

import java.util.ArrayList;
import java.util.List;

public class VD6 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("John");
        names.add("Bob");
        names.add("John");
        names.add("Steve");
        names.add("Steve");
        names.add("Maria");

        //Kiểm tra xem ArrayList có chứa một phần tử nhất định không
        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));

        //Find the index of the first occurrence of an element in an ArrayList
        //Tìm chỉ mục của lần xuất hiện đầu tiên của một phần tử trong ArrayList
        System.out.println("index of \"Steve\": " + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"John\" : " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));
    }
}
