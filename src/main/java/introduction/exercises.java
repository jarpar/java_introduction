package introduction;

import java.sql.SQLOutput;

public class exercises {
    public static void main(String[] args) {
        StringBuilder words = new StringBuilder("");
        words.append("Ala ");
        words.append("ma ");
        words.append("kota.");

        System.out.println(words);

        System.out.println(words.charAt(4));

        if (words.toString().startsWith("Ala") && words.toString().endsWith("kota.")) {
            System.out.println(true);
        }

        System.out.println("Litwo! Ojczyzno moja!".length());

        String alphabet = "abcdefgh";
        for (int i = 0; i < alphabet.length(); i++) {
            if ('d' == alphabet.charAt(i)) {
                System.out.println(i);
            }
        }
        //another solution:
        System.out.println(alphabet.indexOf('d'));

        String text = "ALa ma kota, kot ma mleko!";
        System.out.println(text.substring(6, 11));
        System.out.println(text.toUpperCase().contains("ALA"));
        String text1 = "Ala ma kota";
        String text2 = "ALA MA KOTA";
        System.out.println(text1.equals(text2));
        System.out.println(text1.equalsIgnoreCase(text2));
        words.replace(0, 3, "Tadek");
        System.out.println(words);
        System.out.println(" Ala ma kota ".trim());
    }
}
