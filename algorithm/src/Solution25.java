import java.text.DecimalFormat;

public class Solution25 { // 정수 제곱근 판별

    public static long solution25(long n) {

        long answer = 0;
        String result = new DecimalFormat("#.##").format(Math.sqrt(n));

        boolean ox = result.matches("-?\\d+");

        if(ox == true){
            answer = (Long.parseLong(result)+1)*(Long.parseLong(result)+1);
        }else {
            answer = -1;
        }
        return answer; //144
    }

    public static void main(String[] args) {
        System.out.println(solution25(121));
    }
}
