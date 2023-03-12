import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_tests = sc.nextInt();
        for (int i = 0; i < total_tests; i++) {
            boolean checker = false;
            String message = "";
            if (sc.hasNextByte()) {
                checker = true;
                message = message + "* byte\n";
            }
            if (sc.hasNextShort()) {
                checker = true;
                message = message + "* short\n";

            }
            if (sc.hasNextInt()) {
                checker = true;
                message = message + "* int\n";

            }

            if (sc.hasNextLong()) {
                checker = true;
                message = message + "* long";
            }

            if (checker) {
                long line = sc.nextLong();
                System.out.println(line + " can be fitted in:");
                System.out.println(message);
            } else {
                String line = sc.next();
                System.out.println(line + " can't be fitted anywhere.");
            }

        }
    }
}