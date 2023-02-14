public class Main {
    public static void main(String[] args) {
        double value = 1;
        System.out.println("Ряд чисел: 1 + 1/2 + 1/3 ... + 1/n; кроків - 53" );
        for (double n = 0; n < 53; n++) {
            int i = 1;
            i += n;
            value += 1 / (n + 2);
            System.out.println("Крок " + i + " = " + value);
        }
    }
}