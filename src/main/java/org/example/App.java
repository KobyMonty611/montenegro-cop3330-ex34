package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        Scanner scan = new Scanner(System.in);

        System.out.println("There are " + employees.size() + " employees: ");

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println();
        System.out.println("Enter an employee name to remove: ");
        String nameRemove = scan.nextLine();

        employees.remove(nameRemove);

        System.out.println();
        System.out.println("There are " + employees.size() + " employees: ");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        scan.close();
    }
}