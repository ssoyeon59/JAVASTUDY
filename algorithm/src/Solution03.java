public class Solution03 { //가운데 글자 가져오기

    public static String solution03(String s) {
        String answer = "";

        int a = s.length() / 2;

        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 == 0) {//짝수일때
                answer += s.substring(a-1, a+1);
            } else {
                answer += s.substring(a, a + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution03("abcde"));
    }
}
