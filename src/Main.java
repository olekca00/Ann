public class Main {
    public static void main(String[] args) {
//        for(int i = 0; i < 5 ; i++){
//            System.out.println("i = " + i);
//        }

        double value = 238;
        System.out.println("1% від " + value + " = " + calcPercent(value, 1));
        System.out.println("2% від " + value + " = " + calcPercent(value, 2));
        System.out.println("3% від " + value + " = " + calcPercent(value, 3));
        System.out.println("4% від " + value + " = " + calcPercent(value, 4));
        System.out.println("5% від " + value + " = " + calcPercent(value, 5));
        System.out.println("6% від " + value + " = " + calcPercent(value, 6));
        ////////
        System.out.println("99% від " + value + " = " + calcPercent(value, 99));
        System.out.println("100% від " + value + " = " + calcPercent(value, 100));

        for (int p = 0; p <= 100; p++) {
            System.out.println(p + "% від " + value + " = " + calcPercent(value, p));
        }

        //сума чисел від 1....n
        int n = 999;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        System.out.println("Сума числе від 0 до " + n + " буде " + sum);
    }


    public static double calcPercent(double v, int p) {
        return v * p / 100;
    }
}