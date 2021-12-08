package com.company;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        //int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        //int sum = a+ b;
        float sum = a + b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
    }
}
