package org.tomislavgazica.assignment6;

public class Assignment6 {

    public static int[] reverse(int[] field) {
        int temp;

        for (int i = 0; i < field.length / 2; i++) {
            temp = field[i];
            field[i] = field[field.length - i - 1];
            field[field.length - i - 1] = temp;
        }

        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");

            if (i == field.length-1) {
                System.out.println();
            }
        }

        return field;
    }

    public static void main(String[] args) {

        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < numList.length; i++) {
            System.out.print(numList[i] + " ");

            if (i == numList.length-1) {
                System.out.println();
            }
        }

        reverse(numList);

    }

}
