package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ans = 'y';
        Calculator obj = new Calculator();
        Scanner s = new Scanner(System.in);
        while (ans == 'y' || ans == 'y') {
            System.out.println("Please Enter First Number: ");
            int a = s.nextInt();
            System.out.println("Please Enter Second Number: ");
            int b = s.nextInt();
            System.out.println("Kindly Choose one Symbol (+,-,*,/): ");
            char symbol = s.next().charAt(0);
            obj.calculateResult(a, b, symbol);
            System.out.println("If you would wish to continue enter 'y' or 'n': ");
            ans = s.next().charAt(0);
        }
        s.close();
    }
}
