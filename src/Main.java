public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i = FizzBuzz.doFizzBuzz(i);
        }
        // My attempt at calling FizzBuzz.main
        String[] cars = {"hello"};
        FizzBuzz.main(cars);
    }
}
