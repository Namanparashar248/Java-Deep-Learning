package basics.arrays;

import java.util.Scanner;

public class ArrayReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element:");
            arr[i] = sc.nextInt();
        }

        // Reverse print
        System.out.println("Reverse array:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}