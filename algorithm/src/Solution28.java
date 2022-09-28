public class Solution28 {
    /*양의 정수 x 가 하샤드 수 이려면 x 자릿수의 합으로 x가 나누어져야 한다.

    18의 자릿수 합은 1+8=9이고 18은 9로 나누어 떨어지므로 하샤드 수 이다
    자연수 x를 입력받아 하샤드수인지 아닌지 검사하는 함수 */

    public static boolean solution28(int x) {
        boolean answer = true;
        int sum = 0; // 자릿수의 합 초기화
        int n = x; //나누기 위해 값을 저장

        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }

        return n % sum == 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(solution28(10));
        System.out.println(solution28(11));
    }
}
