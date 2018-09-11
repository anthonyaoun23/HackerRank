
// https://www.hackerrank.com/challenges/java-date-and-time/problem

import java.util.Scanner;

public class Solution {

    public static String getDay(String day, String month, String, year){
                int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        
        LocalDate time = new LocalDate(y,m,d);
        return time.getDayOfWeek().name();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}