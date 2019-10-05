package Main;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = s.nextLine();
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            total += str.charAt(i);
        }
        System.out.println("totalWeight : " + total);


    }
}
