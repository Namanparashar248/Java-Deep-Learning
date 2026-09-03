package basics.arrays;

import java.util.Scanner;

public class ArrayInputLoop {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the size of the array:" );
        int n =sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}