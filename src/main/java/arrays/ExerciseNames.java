package arrays;

public class ExerciseNames {
    public static void main(String[] args) {
        String[] names = new String[]{"Ala", "Ola", "Andrzej", "Brunhilda", "Gienia", "Bożydar", "Gniewomir", "Sławomir", "Mścisław", "Stanisław", "Bronisław", "Wiercisław", "Xiercisław", "Yiercisław", "Ziercisław", "Petronela", "Kunegunda"};

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

        System.out.println("-------------------------------------------");

        System.out.println("Imiona żeńskie nie dłuższe niż 3 znaki to: ");
        for (String name : names) {
            if (name.endsWith("a") && name.length() <= 3) {
                System.out.println(name);
            }
        }

        System.out.println("-------------------------------------------");

        System.out.println("Imiona męskie to: ");
        for (String name : names) {
            if (name.endsWith("mir") || name.endsWith("sław")) {
                System.out.println(name);
            }
        }

        System.out.println("-------------------------------------------");

        StringBuilder longestName = new StringBuilder();
        StringBuilder tempLongestName = new StringBuilder();
        int longestLength = 0;
        for (String name : names) {
            if (name.length() == longestLength) {
                tempLongestName.append(name).append(" ");
                longestName.replace(0, longestName.length(), String.valueOf(tempLongestName));
            }
            if (name.length() > longestLength) {
                longestLength = name.length();
                tempLongestName.replace(0, tempLongestName.length(), name + " ");
                longestName.replace(0, longestName.length(), String.valueOf(tempLongestName));
            }
        }
        System.out.println("Najdłuższe imię/imiona to: " + longestName);
    }
}