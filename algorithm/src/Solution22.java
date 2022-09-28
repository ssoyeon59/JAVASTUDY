public class Solution22 {// 자리수 더하기

    public static int solution22(int n) {

        int answer = 0;

        while (n != 0) {
            answer += n % 10; // n을 10으로 나눈 나머지를 answer에 더한다
            n /= 10; // n을 10으로 나눈 값을 다시 n에 저장한다
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer; //6
    }

    public static void main(String[] args) {
        System.out.println(solution22(123));
    }
}
