package basics.arrays;
import java.util.Scanner;
public class ArrayMaximum {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Bhaiyaa Array ka size dedo ");
            int t = sc.nextInt();

            int[] arr = new int[t];

            for (int i = 0; i < arr.length; i++) {

                System.out.println("Element " + i + " dedo:");
                arr[i] = sc.nextInt();
            }

            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Maximum element = " + max);
        }
    }