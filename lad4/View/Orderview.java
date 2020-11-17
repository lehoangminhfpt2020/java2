package EbookStore.View;

import EbookStore.Controller.OrderCotroller;

import java.util.Scanner;

public class Orderview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n" + "============================================");
            System.out.println(
                    "1. Display New Orders\n" +
                    "2. Display Order by CustomerID\n" +
                    "3. Display Order by OrderID\n" +
                    "4. Display Order detail by OrderID\n" +
                    "5. Display pending Order\n" +
                    "6. Display ready Order\n" +
                    "7. Display delivering Order\n" +
                    "8. Display delivered Order\n" +
                    "9. Display canceled Order\n" +
                    "0. Exit");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Thank you");
                    break;
                case 1:
                    OrderCotroller.ShowOrdersST(1);
                    break;
                case 2:
                    OrderCotroller.ShowOrdersbyCID();
                    break;
                case 3:
                    OrderCotroller.ShowOrdersbyID();
                    break;
                case 4:
                    OrderCotroller.ShowSTOrdersbyID();
                    break;
                case 5:
                    OrderCotroller.ShowOrdersST(2);
                    break;
                case 6:
                    OrderCotroller.ShowOrdersST(3);
                    break;
                case 7:
                    OrderCotroller.ShowOrdersST(4);
                    break;
                case 8:
                    OrderCotroller.ShowOrdersST(5);
                    break;
                case 9:
                    OrderCotroller.ShowOrdersST(0);
                    break;
            }
        }while(choice!=0);
    }
}
