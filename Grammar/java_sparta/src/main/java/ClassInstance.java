class Calculation {
    int add(int x, int y) {
        return x + y;
    }
    int subtract (int x, int y) {
        return x - y;
    }
}

public class ClassInstance {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        int addResult = calculation.add(1, 2);
        calculation.add(3, 5);
        int subtractResult = calculation.subtract(5, 3);

        System.out.println(addResult);
        System.out.println(subtractResult);
    }
}