package Main;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = s.nextLine();
        System.out.println("String In Upper Case : " + str.toUpperCase());
        s.close();
    }
}
