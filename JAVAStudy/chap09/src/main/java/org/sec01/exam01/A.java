package org.sec01.exam01;

/** 바깥 클래스 **/
class A {
    A() {
        System.out.println("A 객체가 생성죔");
    }

    /** 인스턴스 멤버 클래스 **/
    class B {
        B() {
            System.out.println("B 객체가 생성됨");
        }//생성자
        int field1; //인스턴스 필드
        //static int field2; //정적필드(x)
        void method1() { } //인스턴스 메서드
        //static void method2() { } //정적 메서드(x)
    }

    /** 정적 멤버 클래스 **/
    static class C {
        C() {
            System.out.println("C 객체가 생성됨");
        }
        int field1; //인스턴스 필드
        static int field2; //정적필드(x)
        void method1() { } //인스턴스 메서드
        static void method2() { } //정적 메서드(x)
    }

    void method() {
        /** 로컬 클래스 **/
        class D {
            D() {
                System.out.println("D 객체가 생성됨");
            }
            int field1; //인스턴스 필드
            //static int field2; //정적필드(x)
            void method1() { } //인스턴스 메서드
            //static void method2() { } //정적 메서드(x)
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
