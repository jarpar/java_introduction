package arrays;

import javax.sql.rowset.spi.SyncResolver;

public class ExerciseNames {
    public static void main(String[] args) {
        String[] names = new String[]{"Ala", "Ola", "Andrzej", "Brunhilda", "Gienia", "Bożydar", "Gniewomir", "Sławomir", "Mścisław", "Stanisław", "Bronisław", "Wiercisław", "Petronela", "Kunegunda"};
        /*
        1. wypisz imiona żeńskie -a
        2. imiona żeńskie nie dłuższe niż 3
        3. imiona słowiańskie -mir oraz -sław
        4. najdłuższe imię
         */
        System.out.println("Imiona żeńskie to: ");
        for (String name : names) {
            if (name.endsWith("a")) {
                System.out.println(name);
            }
        }
        System.out.println("Imiona żeńskie nie dłuższe niż 3 znaki to: ");
        for (String name : names) {
            if (name.endsWith("a") && name.length() <= 3) {
                System.out.println(name);
            }
        }
        System.out.println("Imiona męskie to: ");
        for (String name : names) {
            if (name.endsWith("mir") || name.endsWith("sław")) {
                System.out.println(name);
            }
        }
        StringBuffer longestName = new StringBuffer();
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName.replace(0, longestName.length(), name);
            }
        }
        System.out.println("Najdłuższe imię to: " + longestName);
    }
}
