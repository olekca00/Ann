public class IfElse {
    public static void main(String[] args) {
        int two_pow10 = 1024;
        int two_pow11 = 2048;
        if (two_pow10 == 0 || two_pow11 == 0) {
            System.out.println("zero");
        }
        else if (two_pow10 == two_pow11) {
            System.out.println("two_pow10 = two_pow11");
        }
        else if (two_pow10 < two_pow11) {
            System.out.println("two_pow11");
        }
        else {
            System.out.println("two_pow10");
        }
    }
}
