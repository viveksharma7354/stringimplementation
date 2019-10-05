package Main;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = s.nextLine();
        System.out.print("Enter Your Character : ");
        char ch = s.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println("Index For Inputted Character Is : " + i);
            }
        }
        s.close();
    }
}
