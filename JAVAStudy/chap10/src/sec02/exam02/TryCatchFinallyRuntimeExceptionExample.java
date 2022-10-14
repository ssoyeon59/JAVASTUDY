package sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;
        try {
            data1 = args[0]; //1. 여기서 예외가 나타났다 실행 매개값이 없기 때문이다
            data2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("시스템 매개값의 수가 부족합니다.");
            return;
        }

        //2. Run > Edit Configurations 의 program argument 에 "룰루 2" 를 집어 넣었기 때문에 예외가 발생하였고
        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally { //3. 무조건 출력되는 값
            System.out.println("다시 실행하세요.");
        }
    }
}
