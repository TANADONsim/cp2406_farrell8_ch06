public class Factorials {

    public static void main(String[] args) {

        int counter;
        long factorials = 1;
        //        long total = 1;

        System.out.printf("%4s%30s\n", "Number", "Factorials");

        for(counter = 1; counter <= 10; counter++){
            factorials *= counter;
            System.out.printf("%4d%,30d\n", counter, factorials);
        }
    }
}