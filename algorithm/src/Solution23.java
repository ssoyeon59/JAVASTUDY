public class Solution23 { //자연수 뒤집기
    //뒤집어 각 자리 숫자를 원소를 가진는 배열 형태로 리턴
    public static int[] solution23(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt = 0;

        while (n > 0) {
            answer[cnt] = (int)(n % 10);
            n /= 10;
//            System.out.println(n);
            cnt++;
        }
        return answer; //[5, 4, 3, 2, 1] 결과값은 다르게 찍힘
    }

    public static void main(String[] args) {
        System.out.println(solution23(12345));
    }
}
