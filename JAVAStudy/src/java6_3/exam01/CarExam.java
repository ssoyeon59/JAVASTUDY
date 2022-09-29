package java6_3.exam01;

import java6_3.exam01.Car;

public class CarExam { //생성자를 호출해서 객체 생성

    public static void main(String[] args) {
        Car myCar = new Car("검정", 3000);
        //Car myCar = new Car(); (x)기본 생성자 호출 못함
    }

    /*public static void main(String[] args) {
        Car myCar = new Car ("검정", 3000);
        //Car myCar = new Car(); //기본생성자 호출할 수 없음
        // (생성자가 하나라도 추가가 되어있다면 기본생성자는 사용할 수 없다.)
        // 더이상 기본 생성자를 car객체를 생성할 수없다.
//        Car c1 = new Car();
        Car c2 = new Car("소방차"); //name를 갖는 생성자를 참조한다
        Car c3 = new Car("구급차");

        System.out.println(c2.name);
        //이미 Car(String color, int cc)라고 Car클래스에 선어이 되어있음
    }*/

}
