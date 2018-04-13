package org.tomislavgazica.assignment1;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.print("Enter the number: ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum is: " + sum);
    }
}
