package Lad1Arraylist;

import java.util.ArrayList;
import java.util.List;

public class VD3 {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        //.isEmpty sẽ kiểm tra xem là danh sách mảng có rỗng ko = trả về true hoặc Fail ( yes no Que)
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        System.out.println(topCompanies);

        // Retrieve the element at first index
        String bestCompany = topCompanies.get(0);

        // Retrieve the element at second index
        String secondBestCompany = topCompanies.get(1);

        // Retrieve the element at last index. take the size of Arraylist - 1 we got last index
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);

        topCompanies.set(4,"Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}
