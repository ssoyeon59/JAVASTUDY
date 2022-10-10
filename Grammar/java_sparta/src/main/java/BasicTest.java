import java.util.Arrays;

public class BasicTest {

    public static void main(String[] args) {
        //퀴즈1 - 문자변수'S', 정수형 변수 10을 선언 및 출력해보세요
//        String s = "S"; //문자열변수
//        System.out.println(s);
        char n = 'S'; //문자 변수
        System.out.println(n);
        int a = 10;
        System.out.println(a);
        System.out.println(n + a); // 아스키코드로 인해 S가 83이어서 더해진 93이 됨
        System.out.println(n + "" + a); // S10
        System.out.println(n + "\n" + a); // \n개행을 해줘

        //퀴즈2 - 크기가 3인 정수형 배열을 선언 및 주어진 숫자 3개를 할당해보세요
        int[] Array = new int[] {10, 20, 30}; //선언과 동시에 할당
        System.out.println(Arrays.toString(Array));
        //배열의 마지막 값을 출력해 보세요
        System.out.println(Array[Array.length-1]);
        System.out.println(Array[2]);


    }
}
