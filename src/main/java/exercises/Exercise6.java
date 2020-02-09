package exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        UserExtended[] users = new UserExtended[100];
        int usersCount = 0;
        String line;
        Scanner scanner = new Scanner(System.in);
        do {
            line = scanner.nextLine();
            if (!line.startsWith("exit")) {
                UserExtended newUser = parseUser(line);
                users[usersCount] = newUser;
                usersCount++;
            }
        } while (!line.startsWith("exit"));

        for (UserExtended user : users) {
            System.out.println(user);
        }

    }

    private static UserExtended parseUser(String line) {
        //"Adam Kowalski 1968/05/13"
        String[] splittedData = line.split(" ");
        String name = splittedData[0];
        String lastname = splittedData[1];
        LocalDate dayOfBirth = parseDate(splittedData[2]);
        return new UserExtended(name, lastname, dayOfBirth);
    }

    private static LocalDate parseDate(String dateText) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return LocalDate.parse(dateText, formatter);
    }
}