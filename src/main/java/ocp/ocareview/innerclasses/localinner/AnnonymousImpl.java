package ocp.ocareview.innerclasses.localinner;

public class AnnonymousImpl {
    private interface SumCalculator {
        void printSum(int a, int b);
    }

    SumCalculator getLambdaCalc() {
        return (int a, int b) -> System.out.println(a + b);
    }

    SumCalculator getAnnonymousImplCalc() {
        return new SumCalculator() {
            @Override
            public void printSum(int a, int b) {
                System.out.println(a + b);
            }
        };
    }

    public static void main(String... args) {
        SumCalculator lambdaCalc = new AnnonymousImpl().getLambdaCalc();
        lambdaCalc.printSum(7, 8);

        SumCalculator annonymousImplCalc = new AnnonymousImpl().getAnnonymousImplCalc();
        annonymousImplCalc.printSum(7, 8);
    }
}
