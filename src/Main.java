public class Main {
        public static void main(String[] args){
            String s1 = "The quick brown fox jumps over the lazy dog."; // 1.

            int stringLength = s1.length(); //2.
            System.out.println("length of s1 is " + stringLength); //3.
            System.out.println(s1.replace('d', 'f')); //4.

            String s2 = "10-A. ";//5.
            String s3 = "Bardysh Anna"; //6.
            String s4 = s2.concat(s3); //7.
            System.out.println(s4); //7.
        }
}