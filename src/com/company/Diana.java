package com.company;

import java.util.Scanner;
import java.util.Scanner;

public class Diana {

    public static void main(String[] args) {
        System.out.println("Username: ");
        String username = readValueFromConsole();
        System.out.println("Welcome " + username + "!");

        String password = "12345";
        int counter = 0;
        boolean isValid;
        do {
            System.out.println("Password:");
            String userPassword = readValueFromConsole();
            counter ++;

            isValid = password.equals(userPassword);
            if(isValid) {
                System.out.println("You have access!");
                System.out.println("Ai gasit comoara! Din " + counter + " incercari!");
            } else {
                System.out.println("ACCESS DENIED! Attempts " + counter + ".");
            }
            if(counter >= 3) {
                System.out.println("Reached max attempts!");

            }
        } while(!isValid && counter <3 );

    }

















    private static String readValueFromConsole() {
        return new Scanner(System.in).nextLine();
    }
}
