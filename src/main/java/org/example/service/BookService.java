package org.example.service;

import org.example.database.Database;
import org.example.model.Book;
import org.example.utils.MyScanner;

public class BookService {
    public static void shortInfoBookList() {
        if(Database.bookList.isEmpty()){
            System.out.println("Books not found." );
        }else {
            Database.bookList.forEach(book -> {
                System.out.println(book.publicInfo());
            });
        }
    }

    public static void addBook() {
    }

    public static void update() {
        list();
        System.out.print("Enter book id: ");
        int id = MyScanner.scanner_num.nextInt();
        Book bookUp = null;
        for (Book book:Database.bookList){
            if (book.getId()==id){
                bookUp = book;
            }
        }
        if(bookUp==null){
            System.out.println("Books not found!");
        }
        else{
            System.out.print("Enter book title: ");
            String title = MyScanner.scanner_str.nextLine();
            System.out.print("Enter book author: ");
            String author = MyScanner.scanner_str.nextLine();
            System.out.print("Enter book description: ");
            String description = MyScanner.scanner_str.nextLine();
            System.out.print("Enter book price: ");
            Double price = MyScanner.scanner_str.nextDouble();
            System.out.print("Enter book count: ");
            Integer count = MyScanner.scanner_num.nextInt();
            bookUp.setTitle(title);
            bookUp.setAuthor(author);
            bookUp.setDescription(description);
            bookUp.setPrice(price);
            bookUp.setBookCount(count);
            System.out.println("Book succesfuly updated!");
        }
    }

    public static void list() {
        if(Database.bookList.isEmpty()){
            System.out.println("Books not found");
        }
        else {
            Database.bookList.forEach(book -> {
                System.out.println(book.publicInfo());
            });
        }
    }

    public static void delete() {
        list();
        System.out.print("Enter book id:");
        int id = MyScanner.scanner_num.nextInt();
        boolean flag = Database.bookList.removeIf(book -> book.getId()==id);
        if(flag){
            System.out.println("Book succesfuly deleted");
        }
        else{
            System.out.println("Invalid id");
        }
    }
}
