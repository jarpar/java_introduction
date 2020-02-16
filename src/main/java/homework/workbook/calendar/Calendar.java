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
/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/208/lib/idea_rt.jar=45861:/snap/intellij-idea-community/208/bin -Dfile.encoding=UTF-8 -classpath /home/user/battlefield/java_introduction/target/classes:/home/user/.m2/repository/commons-io/commons-io/2.6/commons-io-2.6.jar:/home/user/.m2/repository/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar:/home/user/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.1.1/junit-jupiter-params-5.1.1.jar:/home/user/.m2/repository/org/apache/commons/commons-lang3/3.7/commons-lang3-3.7.jar:/home/user/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:/home/user/.m2/repository/com/google/guava/guava/21.0/guava-21.0.jar:/home/user/.m2/repository/com/google/guava/guava-testlib/20.0/guava-testlib-20.0.jar:/home/user/.m2/repository/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar:/home/user/.m2/repository/com/google/errorprone/error_prone_annotations/2.0.12/error_prone_annotations-2.0.12.jar:/home/user/.m2/repository/junit/junit/4.8.2/junit-4.8.2.jar:/home/user/.m2/repository/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar homework.workbook.calendar.Calendar
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