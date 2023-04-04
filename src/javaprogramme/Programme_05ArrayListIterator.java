package javaprogramme;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Programme_05ArrayListIterator {
    public void iterateElements() {
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
//        for (String a : colours) {
//            System.out.println(a);
//        }
        // Using Iterator
        Iterator i = colours.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    //Declares main method
    public static void main(String[] args) {
        Programme_05ArrayListIterator obj = new Programme_05ArrayListIterator();
        obj.iterateElements();
    }
}
