package basics.arrays;

import java.util.Scanner;

public class arrayques {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bhaiyaa Array ka size dedo ");
        int t = sc.nextInt();

        int arr[] = new int[t];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Element " + i + " dedo:");
            arr[i] = sc.nextInt();

            sum = sum + arr[i];
        }

        System.out.println("Array ka total sum = " + sum);

    }
}