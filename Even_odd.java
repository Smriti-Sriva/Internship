package com.java.even_odd;

import java.util.Scanner;
public class Even_odd {
public static void main(String[]args) {
	int n;
    @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
    System.out.print("Enter the number you want to check:");
    n = s.nextInt();
    if(n % 2 == 0)
    {
        System.out.println("The given number "+n+" is Even ");
    }
    else
    {
        System.out.println("The given number "+n+" is Odd ");
}
}
}