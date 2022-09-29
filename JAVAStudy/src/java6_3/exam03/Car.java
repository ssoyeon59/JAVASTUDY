package java6_3.exam03;

public class Car { // 생성자 오버로딩
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car() { // 1생성자

    }

    public Car(String model) { // 2생성자
        this.model = model;
    }

    public Car(String model, String color) { // 3생성자
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, int maxSpeed) { // 4생성자
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
