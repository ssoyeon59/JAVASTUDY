package java6_3.exam02;

import java6_3.exam02.Korean;

public class KoreanExam { //객체 생성후 필드 값 출력

    public static void main(String[] args) {

        Korean k1 = new Korean("박자바", "011225-1234567");
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);

        Korean k2 = new Korean("김자바", "930525-0654321");
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }
    /**
     * this.name(필드) = name(매개변수);
     * this.snn = snn;
     */
}
