package introduction;

import java.util.Scanner;

public class Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select type: int, long, short, float, double: ");
        String type = null;
        if (scanner.hasNext()) {
            try {
                type = scanner.nextLine().trim().toLowerCase();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Select value: min, max:");
        String value = null;
        if (scanner.hasNext()) {
            try {
                value = scanner.next().trim().toLowerCase();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        int intValMin = Integer.MIN_VALUE;
        int intValMax = Integer.MAX_VALUE;

        long longMinVal = Long.MIN_VALUE;
        long longMaxVal = Long.MAX_VALUE;

        short shortMinVal = Short.MIN_VALUE;
        short shortMaxVal = Short.MAX_VALUE;

        float floatMinVal = Float.MIN_VALUE;
        float floatMaxVal = Float.MAX_VALUE;

        double doubleMinVal = Double.MIN_VALUE;
        double doubleMaxVal = Double.MAX_VALUE;

        switch (type) {
            case "int":
                if ("min".equals(value)) {
                    System.out.println("Integer minimum value: " + intValMin);
                } else if ("max".equals(value)) {
                    System.out.println("Integer maximum value: " + intValMax);
                } else {
                    System.out.println("Wrong value!");
                }
                break;
            case "long":
                if ("min".equals(value)) {
                    System.out.println("Long minimum value: " + longMinVal);
                } else if ("max".equals(value)) {
                    System.out.println("Long maximum value: " + longMaxVal);
                } else {
                    System.out.println("Wrong value!");
                }
                break;
            case "short":
                if ("min".equals(value)) {
                    System.out.println("Short minimum value: " + shortMinVal);
                } else if ("max".equals(value)) {
                    System.out.println("Short maximum value " + shortMaxVal);
                } else {
                    System.out.println("Wrong value!");
                }
                break;
            case "float":
                if ("min".equals(value)) {
                    System.out.println("Float minimum value: " + floatMinVal);
                } else if ("max".equals(value)) {
                    System.out.println("Float maximum value: " + floatMaxVal);
                } else {
                    System.out.println("Wrong value!");
                }
                break;
            case "double":
                if ("min".equals(value)) {
                    System.out.println("Double minimium value: " + doubleMinVal);
                } else if ("max".equals(value)) {
                    System.out.println("Double minimum value: " + doubleMaxVal);
                } else {
                    System.out.println("Wrong value!");
                }
            default: {
                System.out.println("Wrong type!");
            }
        }
    }
}