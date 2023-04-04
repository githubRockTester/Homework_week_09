package javaprogramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Programme_03ReverseArray {

    public static void main(String[] args) {
        Programme_03ReverseArray obj = new Programme_03ReverseArray();
        obj.reverseArray();
    }

    public void reverseArray() {
        //Declaring original array
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Original array : " + Arrays.toString(a));
        for (int i = 0; i < a.length/2; i++) {

            // Reversing array
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println("Reverse array  : " + Arrays.toString(a));
    }

//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        reverse(arr, arr.length);
//    }
//    //reverses array and stores it in another array
//    static void reverse(int a[], int n) {
//        int b[] = new int[n];
//        int x = n;
//        for (int i = 0; i < n; i++) {
//            b[x - 1] = a[i];
//            x = x - 1;
//        }
//        //Printing the reversed array
//        System.out.println("Reverse array is: \n");
//        for (int y = 0; y < n; y++) {
//            System.out.print(b[y]);
//        }
}
