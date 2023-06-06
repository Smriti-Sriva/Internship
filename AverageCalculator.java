package com.AverageCalculator.java;
import java.util.Scanner;
public class AverageCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the first number: ");
double num1 = input.nextDouble();
System.out.print("Enter the second number: ");
double num2 = input.nextDouble();
double average = (num1 + num2) / 2;
System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
input.close();
}
}
