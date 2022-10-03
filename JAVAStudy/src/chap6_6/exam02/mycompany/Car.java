package chap6_6.exam02.mycompany;

import chap6_6.exam02.hankook.*;
import chap6_6.exam02.kumho.*;
import chap6_6.exam02.hyundai.Engine;

public class Car {
    //필드
    Engine engine = new Engine();
    SnowTire snowTire = new SnowTire();
    BigWidthTire bigWidthTire = new BigWidthTire();
    //Tire 클래스는 import된 두패키지(hankook, kumho)에 모두 존재
    //패키지이름과 함께 전체이름이 기술
    chap6_6.exam02.hankook.Tire tire3 = new chap6_6.exam02.hankook.Tire();
    chap6_6.exam02.kumho.Tire tire4 = new chap6_6.exam02.kumho.Tire();
}
