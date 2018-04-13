package org.tomislavgazica.assignment7;

public class Assignment7 {

    public static int[] oddPositions(int[] field) {

        int[] oddField = new int[field.length / 2];

        for (int i = 1, j = 0; i < field.length; i += 2, j++) {
            oddField[j] = field[i];
            System.out.println("Position: " + i + ", number: " + oddField[j]);
        }

        return oddField;
    }

    public static void main(String[] args) {

        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        oddPositions(numList);

    }

}
