public class Solution27 { //콜라츠 추측
    /*주어진 경우가 1인 경우엔 0 작업을 500번 반복할때까지 1이 되지 않는다면 -1

    <콜라츠 추측>
    입력된 수가 짝수라면 /2
    입력된 값이 홀수라면 *3 +1
    결과가 나온 값이 1이 될때까지 반복*/

    public static int solution27(int num) {
        int answer = 0;

        while (num != 1) {
            answer++;

            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1) { //왜 != 0 이 아닌거지ㅠㅠ?
                num = num * 3 + 1;
            }

            if (answer == 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution27(6));//8
        System.out.println(solution27(626331));//-1
    }
}
