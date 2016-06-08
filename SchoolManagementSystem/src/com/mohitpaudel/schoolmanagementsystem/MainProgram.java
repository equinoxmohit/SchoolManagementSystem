/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.schoolmanagementsystem;

import com.mohitpaudel.schoolmanagementsystem.util.Sms;
import java.util.Scanner;

/**
 *
 * @author Mohit
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sms sms = new Sms(sc);

        while (true) {
            sms.createMenu();
            int input = sc.nextInt();

            if (input == 1) {
                sms.addStudents();

            } else if (input == 2) {
                //delete
                sms.deleteStudents();

            } else if (input == 3) {
                //display
                sms.displayStudents();

            } else if (input == 4) {
                //search
                sms.searchStudents();
            } else {
                //exit
                System.exit(0);
            }

        }
    }

}
