
// https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%15d", s1);
            System.out.printf("%03d", x);
        }
        System.out.println("================================");

    }
}
