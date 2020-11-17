package EbookStore.View;

import EbookStore.Controller.BookController;

import java.util.Scanner;

public class BookView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n"+ "====================================");
            System.out.println(
                    "1. Top 10 newest books\n" +
                    "2. Top 10 sellers \n" +
                    "3. Display books by category\n" +
                    "4. Display books by author\n" +
                    "5. Display books by ID\n" +
                    "6. Exit");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    BookController.top10new();
                    break;
                case 2:
                    BookController.TopSeller();
                    break;
                case 3:
                    BookController.FindBookByGenre();
                    break;
                case 4:
                    BookController.FindBookByAuthor();
                    break;
                case 5:
                    BookController.FindBookByID();
                    break;
                case 6:
                    System.out.println("Thank you!");
                    break;
            }
        }while(choice!=6);
    }
}
