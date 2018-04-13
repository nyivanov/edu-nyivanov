package ocp.ocareview.abstracts;

abstract class Cat {
    abstract void clean(); // first way
    //void clean(){} // second way
    // third way
}


class Lion extends Cat {
    void clean() {
    }
}