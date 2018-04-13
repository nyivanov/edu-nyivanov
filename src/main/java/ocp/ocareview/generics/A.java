package ocp.ocareview.generics;

import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String... args){
        List<?> list1 = new ArrayList<A>();


        List<? extends A> list2 = new ArrayList<A>();
        List<? extends A> list3 = new ArrayList<B>();
        List<? extends A> list4 = new ArrayList<C>();

        List<? super A> list5 = new ArrayList<A>();
        list5.add(new A());
        list5.add(new B());
        list5.add(new C());

        A result = B.method4(new A());
        if(result != null){}
    }
}

class B extends A {
    static <B extends A> B method4(B pList){
        return (B) new C();
    }
}

class C extends B {
}

