public class Opertor2 {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);// &&는 두가지 모두 참일 경우에는 true를, 그렇지 않을 경우에는 false를 반환합니다.
        System.out.println(a && true);
        System.out.println(a || b);// ||는 두가지 모두 거짓일 경우에는 false를, 그렇지 않을 경우에는 true를 반환합니다.
        System.out.println(!a); // !는 피연산자의 논리값을 바꿉니다. true는 false로 , false는 true로 반환합니다.
    }
}
