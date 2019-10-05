package Main;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int index = s.nextInt();
        System.out.println(str.substring(index));
        s.close();
    }
}
