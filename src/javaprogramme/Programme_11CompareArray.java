package javaprogramme;

import java.util.ArrayList;

/**
 * 11. Declare following two Arraylist and compare.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11CompareArray {
    ArrayList<String> c1 = new ArrayList<>();
    ArrayList<String> c2 = new ArrayList<>();

    public static void main(String[] args) {
        Programme_11CompareArray obj = new Programme_11CompareArray();
        ArrayList c1 = obj.c1;
        ArrayList c2 = obj.c2;
        obj.compareArrayList(c1, c2);
        System.out.println(obj.compareArrayList(c1, c2));
    }

    public boolean compareArrayList(ArrayList c1, ArrayList c2) {
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        return c1.equals(c2);
    }
}
