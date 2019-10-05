package Main;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = s.nextLine();
        System.out.print("Enter Your Character : ");
        char ch = s.nextLine().charAt(0);
        System.out.println("Index For Inputted Character Is : " + str.indexOf(ch));
        s.close();
    }
}
