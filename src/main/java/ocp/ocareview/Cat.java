package ocp.ocareview;

abstract class Cat {
    static final String name = "The Cat";

    static void clean() {
    }
}

final class Lion extends Cat {
    static final void clean() {
    }

}
