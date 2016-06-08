/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.schoolmanagementsystem.util;

import java.util.Scanner;

/**
 *
 * @author Mohit
 */
public class Sms {

    Scanner sc;
    String[] student = new String[10];
    int counter = 0;

    public Sms(Scanner sc) {
        this.sc = sc;
    }

    public void createMenu() {

        System.out.println("Enter 1 to add students");
        System.out.println("Enter 2 to delete students");
        System.out.println("Enter 3 to display students");
        System.out.println("Enter 4 to search students");
        System.out.println("Enter 5 to exit");
        System.out.println("Enter 1-5");
    }

    public void addStudents() {
        while (true) {
            System.out.println("Enter the student to add:");
            student[counter] = sc.next();
            counter++;

            if (counter == 9) {
                System.out.println("This is the last data you can add");
            }

            System.out.println("Do you want to add more[Y/N]");
            if (sc.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void deleteStudents() {
        System.out.println("Enter the index number you want to delete from 0 to " + counter);
        int value = sc.nextInt();

        for (int i = 0; i < student.length; i++) {
            if (value == i) {
                student[value] = null;
                break;
            }

        }
    }

    public void displayStudents() {
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                System.out.println(student[i]);
            }
        }

    }

    public void searchStudents() {
        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter the character to check");
            if (student[i] != null && student[i].contains(sc.next())) {
                System.out.println(student[i]);
                break;
            } else {
                System.out.println("Sorry the character you entered is not available");
                break;
            }

        }

    }
}
