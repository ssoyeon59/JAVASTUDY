import java.util.Arrays;

public class Solution24 { // 정수 내림차순으로 배치하기

    public static long solution24(long n) {
        String[] list = Long.toString(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();

        for (String i : list) sb.append(i);

        return Long.parseLong(sb.reverse().toString()); //873211
    }

    public static void main(String[] args) {
        System.out.println(solution24(118372));
    }
}
