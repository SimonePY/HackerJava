import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String y = String.valueOf(x);
            String s2 = "";
            if (y.length() == 3) {

                s2 = y;
            } else if (y.length() == 1) {
                s2 = "00" + y;
            } else {
                s2 = "0" + y;
            }
            System.out.printf("%-15s%-15s %n", s1, s2);
        }
        System.out.println("================================");
    }
}