import java.util.Scanner;

public class IfSwitchTest {
    public static void main(String[] args) {
        //입력받은 점수가 무슨 등급인지 출력하세요
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score <= 100 && score > 90) {
            System.out.println("A등급");
        } else if (score <= 90 && score > 80) {
            System.out.println("B등급");
        } else if (score <= 80 && score > 70) {
            System.out.println("C등급");
        } else {
            System.out.println("F등급");
        }
    }
}
