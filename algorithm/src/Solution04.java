public class Solution04 {
    public static long solution04 (int a, int b) {
        long answer = 0;

        if (a <= b) {
            for(int i = a; i <= b; i++)
                answer += i;
        } else {
            for(int i = b; i <= a; i++)
                answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution04(3, 5));
        System.out.println(solution04(3,3));
    }



}
