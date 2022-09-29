package java6_3.exam04;

public class Car {// 다른 생성자를 호출해서 중복 코드 줄이기

    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car() { // (1)생성자

    }
//2, 3, 4 생성자 호출
    Car(String model) { // 2생성자
        this(model, "은색", 250);
    }

    Car (String model, String color) { // 3생성자
        this(model, color, 250);
    }

    Car (String model, String color, int maxSpeed) { // 4생성자
        //공동 실행 코드
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
