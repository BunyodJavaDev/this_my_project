package org.example.service;

import org.example.controller.MainController;
import org.example.model.Book;
import org.example.utils.MyScanner;

public class AdminService {
    public static void start() {
        boolean flag = true;
        while (flag){
            menu();
            int num = MyScanner.scanner_num.nextInt();
            switch (num){
                case 1:
                    BookService.addBook();
                    break;
                case 2:
                    BookService.update();
                    break;
                case 3:
                    BookService.list();
                    break;
                case 4:
                    BookService.delete();
                    break;
                case 0:
                    MainController.start();
            }
        }
    }

    private static void menu() {
        System.out.println("\nAdmin service\n");
        System.out.println("1 - Add book");
        System.out.println("2 - Update book");
        System.out.println("3 - Get list");
        System.out.println("4 - Delete book");
        System.out.println("0 - Main menu");
        System.out.print("Enter your choise: ");
    }
}
