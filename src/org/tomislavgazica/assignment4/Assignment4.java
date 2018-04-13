package org.tomislavgazica.assignment4;

public class Assignment4 {

    public static void main(String[] args) {

        int year = 2018;
        int i = 0;

        while (true) {
            year++;

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year);
                i++;
                if (i == 20) {
                    break;
                }
            }
        }
    }
}
