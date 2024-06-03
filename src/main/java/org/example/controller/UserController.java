package org.example.controller;

import org.example.database.Database;
import org.example.enums.Role;
import org.example.model.Person;
import org.example.service.AdminService;
import org.example.service.UserService;
import org.example.utils.MyScanner;

public class UserController {
    public static void login() {
        System.out.print("Enter username: ");
        String username = MyScanner.scanner_str.nextLine();
        System.out.print("Enter user password: ");
        String password = MyScanner.scanner_str.nextLine();
        Person personP = null;
        for (Person person: Database.personList){
            if(person.getName().equals(username) && person.getPassword().equals(password)){
                personP = person;
            }
        }
        if(personP!=null) {
            if (personP.getRole().equals(Role.USER)) {
                UserService.start();
            } else if(personP.getRole().equals(Role.ADMIN)) {
                AdminService.start();
            }
        }else {
            System.out.println("Incorrect username or password");
        }
    }

    public static void register() {
        System.out.print("Enter user id: ");
        int id = MyScanner.scanner_num.nextInt();
        System.out.print("Enter user username: ");
        String username = MyScanner.scanner_str.nextLine();
        System.out.print("Enter user password: ");
        String password = MyScanner.scanner_str.nextLine();
        Person person = new Person(id,username,password);
        Database.personList.add(person);
        System.out.println("You succesfuly registered!");
    }
}
