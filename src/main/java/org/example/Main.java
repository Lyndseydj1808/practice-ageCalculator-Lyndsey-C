package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter their age
        System.out.print("Enter your age.");
        int age = scanner.nextInt();

        //calculate number of years left until they turn 100 years old.
        int yearsLeftTo100 = 100 - age;
        System.out.println("You have " + yearsLeftTo100 + " years until you are 100.");
    }
}