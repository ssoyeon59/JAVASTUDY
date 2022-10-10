import java.util.Arrays;

public class BasicDataStr_1 {
    public static void main(String[] args) {
        String sparta = "Hello sparta";
        System.out.println(sparta);

        //int[] 배열이라는 의미
        int[] intArray = new int[] {1, 2, 3, 4, 5}; //int배열을 만들면서 1, 2, 3, 4, 5로 초기화한 코드
        System.out.println(Arrays.toString(intArray));

        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        int[] intArrays = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArrays));

        String[] stringEmptyArray = new String[5]; //값이 없어서 null값이 뜬다
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        System.out.println(season[season.length-1]); //인덱스의 숫자가 0번째부터 시작이라서 -1 넣어줘야한다
    }
}
