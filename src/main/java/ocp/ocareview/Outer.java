package ocp.ocareview;

public class Outer {
    private int x = 4;

    class InnerA {
        private int x = 5;

        class InnerB {
            private int x = 6;

            void printX() {
                System.out.println(this.x);
                System.out.println(Outer.InnerA.InnerB.this.x);
                System.out.println(InnerA.this.x);
                System.out.println(Outer.InnerA.this.x);
                System.out.println(Outer.this.x);
            }
        }
    }

    public static void main(String... args) {
        new Outer().new InnerA().new InnerB().printX();
    }
}
