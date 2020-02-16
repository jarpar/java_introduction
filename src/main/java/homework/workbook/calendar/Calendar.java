package homework.workbook.calendar;

import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date: [yyyy-MM-dd]");
        String input = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(input);
        int today = localDate.getDayOfMonth();
        int monthLength = localDate.lengthOfMonth();
        LocalDate firstDate = LocalDate.parse(input.substring(0, 8) + "01");
        int firstDayOfWeek = firstDate.getDayOfWeek().getValue();
        int[] calendar = new int[monthLength + firstDayOfWeek];
        System.out.println(localDate.getMonth());
        System.out.println("Pn Wt Śr Cz Pt Sb Nd");
        System.out.println("--------------------");
        int count = 0;
        for (int i = firstDayOfWeek - 2; i <= monthLength + firstDayOfWeek - 2; i++) {
            calendar[i] = count;
            count++;
        }
        int countBreak = 0;
        for (int i : calendar) {
            if (countBreak == 7) {
                System.out.println();
                countBreak = 0;
            }
            if (i == today) {
                System.out.print("[" + i + "]");
                countBreak++;
            } else {
                if (i == 0) {
                    System.out.print("   ");
                    countBreak++;
                } else if (i < 10) {
                    System.out.print("  " + i);
                    countBreak++;
                } else {
                    System.out.print(" " + i);
                    countBreak++;
                }
            }
        }
    }
}

/*
/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java
Enter date: [yyyy-MM-dd]
2020-02-16
FEBRUARY
Pn Wt Śr Cz Pt Sb Nd
--------------------
                 1  2
  3  4  5  6  7  8  9
 10 11 12 13 14 15[16]
 17 18 19 20 21 22 23
 24 25 26 27 28 29
Process finished with exit code 0
 */