public class Solution27_1 { //콜라츠 추측
    /*주어진 경우가 1인 경우엔 0 작업을 500번 반복할때까지 1이 되지 않는다면 -1

    <콜라츠 추측>
    입력된 수가 짝수라면 /2
    입력된 값이 홀수라면 *3 +1
    결과가 나온 값이 1이 될때까지 반복*/

    public static int solution27_1(long num) {
        int answer = 0;

        while (num != 1) {
            answer++;

            if (answer == 500) { //long nun 인 이유 488번대에 int가 인식하는 숫자를 넘기때문
                answer = -1;
                break;
            }

            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution27_1(6));//8
        System.out.println(solution27_1(626331));//-1
    }

}
