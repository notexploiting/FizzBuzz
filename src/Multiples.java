public class Multiples {
    public static void main(String[] args) {
        System.out.println("There are " + calculateMultiples(10, 3, 5) + " multiples of 3 and 5 below 10");
        System.out.println("There are " + calculateMultiples(1000, 3, 5) + " multiples of 3 and 5 below 1000");
    }

    public static int calculateMultiples(int limit, int a, int b) {
        int count = 0;
        for (int i = 1; i < limit; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }
}
