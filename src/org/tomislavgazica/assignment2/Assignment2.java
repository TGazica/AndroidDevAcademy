package org.tomislavgazica.assignment2;


import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int operation;
        int result=1;

        System.out.print("Enter the number: ");
        num = in.nextInt();


        while (true) {
            System.out.print("1)Sum \n2)Product\nNumber: ");
            operation = in.nextInt();
            if(operation==1 || operation==2){
                break;
            }
        }

        if (operation == 1) {
            for (int i = 1; i < num; i++) {
                if(i==1){
                    continue;
                }
                result+=i;
            }
        }else {
            for (int i = 1; i < num; i++) {
                result*=i;
            }
        }

        System.out.println("Result: " + result);

    }

}
