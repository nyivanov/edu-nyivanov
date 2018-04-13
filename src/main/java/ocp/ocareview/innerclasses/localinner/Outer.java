package ocp.ocareview.innerclasses.localinner;

public class Outer {
    private interface SumCalculator {
        void printSum(int a, int b);
    }

    SumCalculator getCalculator() {
        class Calculator implements SumCalculator {
            public void printSum(int a, int b) {
                System.out.println(a + b);
            }
        }

        return new Calculator();
    }

    public static void main(String... args) {
        SumCalculator calculator = new Outer().getCalculator();
        calculator.printSum(7, 8);
    }
}
