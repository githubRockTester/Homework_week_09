package javaprogramme;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Programme_07ArrayListEmpty {
    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Programme_07ArrayListEmpty obj = new Programme_07ArrayListEmpty();
        ArrayList list = obj.list;
        obj.isEmptyOrNot(list);
        obj.addElements();
    }

    public void addElements() {
        list.add("White");
        list.add("Black");
        list.add("Blue");
        list.add("Green");
        list.add("Orange");
    }

    // Checking ArrayList is empty or not in instance method
    public void isEmptyOrNot(ArrayList list) {
        System.out.println(list);
        System.out.println("Is the ArrayList empty? : " + list.isEmpty());
        list.removeAll(list);
        System.out.println(list);
        System.out.println("Is the ArrayList empty? : " + list.isEmpty());
    }
}
