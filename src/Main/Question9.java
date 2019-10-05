package Main;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = s.nextLine();
        int totalU = 0;
        int totalL = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 90 && str.charAt(i) >= 65) {
                totalU += str.charAt(i);
            } else if (str.charAt(i) <= 122 && str.charAt(i) >= 97) {
                totalL += str.charAt(i);
            }
        }
        System.out.println("AbsoluteWeight : " + Math.abs(totalU - totalL));
    }
}
