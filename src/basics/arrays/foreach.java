package basics.arrays;

import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element:");
            arr[i] = sc.nextInt();
        }
            System.out.println("printing array using for each loop  ");
            for (int element : arr) {
                System.out.print(element);
            }
        }
    }
