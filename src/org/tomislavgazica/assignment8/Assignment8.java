package org.tomislavgazica.assignment8;

import java.util.Scanner;

public class Assignment8 {

    public static int[] toArray(int num) {
        int[] newArray = new int[String.valueOf(num).length()];
        int i = String.valueOf(num).length() - 1;
        //int i=0;
        int temp = num;

        //while(i<String.valueOf(num).length())
        while (i >= 0) {

            newArray[i] = temp % 10;
            temp /= 10;
            i--;
            //i++;

        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int[] tempArray;

        System.out.print("Enter an int: ");
        num = in.nextInt();

        tempArray = toArray(num);

        for (int i = 0; i < tempArray.length; i++) {
            System.out.println(tempArray[i]);
        }


    }
}
