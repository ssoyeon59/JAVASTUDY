public class Solution11 {

    public static long[] solution11(int x, int n) {

        long[] answer = new long[n];

        for(int i = 0; i <n ; i++){
            answer[i] = (long)x * (i + 1);
        }
        return answer; //answer 값은 잘 나오는데 출력이 이름으로 나온다
    }

    public static void main(String[] args) {
        System.out.println(solution11(2,5));
        System.out.println(solution11(-4, 2));
    }
}
