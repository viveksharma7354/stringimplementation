package Main;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Initial String : ");
        String str1 = s.nextLine();
        System.out.print("Enter String To Be Replaced : ");
        String str2 = s.nextLine();
        System.out.print("Enter Replacement String : ");
        String str3 = s.nextLine();
        System.out.println(str1.replaceAll(str2, str3));
        s.close();
    }
}
