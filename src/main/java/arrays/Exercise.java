package arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] numbers = new int[]{21, 43, 65, 78, 42, 31, 6, 54, 76, 78, 32, 21, 54, 43, 32};
        //znajdź max, min w tablicy
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : numbers
        ) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
