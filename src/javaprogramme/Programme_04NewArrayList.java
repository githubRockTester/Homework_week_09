package javaprogramme;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_04NewArrayList {

    //Declaring instance method
    public void arrayList() {
        //Creating an ArrayList
        ArrayList<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Black");
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Orange");
        colours.add("Purple");

        // Using forEach loop
        for (String a : colours) {
            System.out.println(a);
        }
    }

    //Declares main method
    public static void main(String[] args) {
        // create an object to call instance method in to static method
        Programme_04NewArrayList obj = new Programme_04NewArrayList();
        obj.arrayList();
    }
}
