package javaprogramme;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class Programme_06RetrieveElement {

     //Creating an empty Integer ArrayList
    ArrayList<Integer> arr = new ArrayList<Integer>(5);

    public static void main(String[] args) {
        Programme_06RetrieveElement obj = new Programme_06RetrieveElement();
        obj.retrieveIndex();
    }

    public void retrieveIndex() {

        //Using add() to initialize value
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        System.out.println("List: " + arr);

        //Getting element at index 2
        int a = arr.get(2);
        System.out.println("\nThe element at index 2 is: " + a);
    }
}
