package org.example.database;

import org.example.enums.Role;
import org.example.model.Book;
import org.example.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Person> personList = new ArrayList<>();
    public static List<Book> bookList = new ArrayList<>();

    static {
        Person person = new Person(1,"user","user");
        Person admin = new Person(2,"admin","admin", Role.ADMIN);
        personList.add(person);
        personList.add(admin);

        Book book = new Book(1,"Javascript","Bunyod","Bu oquv darsligi",6000d,10);
        Book book1 = new Book(2,"java","Bekzod aka","Bu java darsligi",8000d,9);
        bookList.add(book);
        bookList.add(book1);
    }
}
