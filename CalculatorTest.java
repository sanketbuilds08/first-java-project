class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Result:" + calc.add(10, 20));

        System.out.println("Result:" + calc.sub(10, 20));

        System.out.println("Result:" + calc.mul(10, 20));

    }
}