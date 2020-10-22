package com.company;
import java.util.Scanner;
public class solution_ex1 {
    public static void main(String[] args) {
        float total = 0;
        System.out.println("_______________WELCOME TO THE CBSE PERCENTAGE CALCULATOR_______________");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total marks of the subject (Eg :- 100/80) :-");
        int total_marks = input.nextInt();
        System.out.println("Enter marks of subject 1st :-");
        float s1 = input.nextFloat();
        total = total + s1;
        System.out.println("Enter marks of subject 2nd :-");
        float s2 = input.nextFloat();
        total = total + s2;
        System.out.println("Enter marks of subject 3rd :-");
        float s3 = input.nextFloat();
        total = total + s3;
        System.out.println("Enter marks of subject 4th :-");
        float s4 = input.nextFloat();
        total = total + s4;
        System.out.println("Enter marks of subject 5th :-");
        float s5 = input.nextFloat();
        total = total + s5;
        float Percentage = total *100 /(total_marks * 5);
        System.out.println("Your Percentage = "+ Percentage +" %");
        System.out.println("_______________THANKS YOU_______________");



    }
}
