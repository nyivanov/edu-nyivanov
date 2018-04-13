package ocp.ocareview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck> {
    private final String name;

    Duck(final String pName) {
        name = pName;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck pCompareTo) {
        return getName().compareTo(pCompareTo.getName());
    }

    public static void main(String... args) {
        Duck firstDuck = new Duck("Donald");
        Duck secondDuck = new Duck("Quackery");
        Duck thirdDuck = new Duck("Abraham");

        List<Duck> ducks = new ArrayList<>();
        ducks.add(firstDuck);
        ducks.add(secondDuck);
        ducks.add(thirdDuck);

        System.out.println(ducks);
        Collections.sort(ducks);
        System.out.println(ducks);

        ducks.sort((pFirst, pSecond) -> pSecond.getName().compareTo(pFirst.getName()));
        System.out.println(ducks);
    }
}
