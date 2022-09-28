public class Solution25_1 {

    public static long solution25_1(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;

        /*double i = Math.sqrt(n);

        return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;*/ //2줄이 식이었음
    }

    public static void main(String[] args) {
        System.out.println(solution25_1(121));
    }
}
