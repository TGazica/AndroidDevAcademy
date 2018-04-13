package org.tomislavgazica.assignment5;

public class Assignment5 {

    public static double getMax(double[] field) {
        double max = 0;

        for (int i = 0; i < field.length; i++) {
            if (i == 0 || max < field[i]) {
                max = field[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        double[] numList = {-2, -3, -4, -5, -6};

        System.out.println(getMax(numList));

    }
}
