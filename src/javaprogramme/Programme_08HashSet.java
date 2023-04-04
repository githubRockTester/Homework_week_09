package javaprogramme;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else).
 */
public class Programme_08HashSet {
    public static void main(String[] args) {
        Programme_08HashSet obj = new Programme_08HashSet();
        obj.addElement();
    }

    //Declaring HashSet
    HashSet<Integer> set = new HashSet<>();

    //declaring instance method to store the value
    public void addElement() {
        set.add(20);
        set.add(4);
        set.add(80);
        set.add(7);
        set.add(50);
        set.add(8);
        set.add(101);
        for (int i : set) {
            if (i > 0 && i < 10) {
                System.out.println(i);
            }
        }
    }
}
