public class ForWhileTest {
    public static void main(String[] args) {
        //1. 1부터100까지의 합을 구하는 반복문 코드 작성
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += (i + 1);
        }
        System.out.println(sum);
        //2. 5초부터 시작하는 카운타다운을 반복문을 사용하여 만들기
        for (int i = 5; i >= 0; i--) {
            System.out.println("카운트다운" + i);
        }
        //3. 1부터 30까지 홀수의 합과 짝수의 합을 구하고 각각 출력하는 프로그램
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) { //짝수
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("sumEven: " + sumEven);
        System.out.println("sumOdd: " + sumOdd);
    }

}
