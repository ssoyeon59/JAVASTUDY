package java6_3.exam03;

public class CarExam { //객체 생성시 생성자 선택

    public static void main(String[] args) {
        Car car1 = new Car(); // 1생성자 선택
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Car car2 = new Car("자가용"); // 2생성자 선택
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.modal : " + car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "빨강"); // 3생성자 선택
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.mocel : " + car3.model);
        System.out.println("car3.color : " + car3.color);

        Car car4 = new Car("택시", "검정", 200); // 4 생성자 선택;
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxspeed : " + car4.maxSpeed);
    }
}
