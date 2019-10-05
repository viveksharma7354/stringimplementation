package Main;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = s.nextLine();
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 90 && str.charAt(i) > 65) {
                total += str.charAt(i);
            }
        }
        System.out.println("Total Upper Weight : " + total);
    }
}
