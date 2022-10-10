public class Operator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        //산술연산자
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 * num2);
//        System.out.println(num1 / num2);
//        System.out.println(num1 % num2); //나머지 연산

        System.out.println(num1);
        //대입연산자
        num1 += num2;
        System.out.println(num1);

        num1-= num2;
        System.out.println(num1);

        num1 *= num2;
        System.out.println(num1);

        num1 /= num2;
        System.out.println(num1);

        num1 %= num2;
        System.out.println(num1);
    }
}
