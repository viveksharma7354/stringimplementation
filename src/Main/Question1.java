package Main;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb1 = new StringBuilder("index:");
        StringBuilder sb2 = new StringBuilder("chars:");
        for (int i = 0; i < str.length(); i++) {
            sb1.append("\t" + i);
            sb2.append("\t" + str.charAt(i));
        }
        System.out.println(sb1.toString() + "\n" + sb2.toString());
        s.close();
    }
}
