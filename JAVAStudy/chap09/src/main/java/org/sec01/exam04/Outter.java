package org.sec01.exam04;

public class Outter {
    public void method (int arg) {
        int localVariable = 1;
        // arg = 100;
        // localVariable = 100;
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }
}
