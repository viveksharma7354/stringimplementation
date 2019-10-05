package Main;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 1;
        System.out.print("Enter Your String : ");
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u') || (str.charAt(i) == 'A') || (str.charAt(i) == 'E') || (str.charAt(i) == 'I') || (str.charAt(i) == 'O') || (str.charAt(i) == 'U')) {
                if ((count - 1) % 3 == 0) {
                    sb.append('*');
                    count++;
                } else if (count % 3 != 0 && (count % 2 == 0 || (count - 2) % 3 == 0)) {
                    sb.append('^');
                    count++;
                } else {
                    sb.append('!');
                    count++;
                }
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
        s.close();
    }
}
