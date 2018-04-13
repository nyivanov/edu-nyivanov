package ocp.ocareview.collections;

import java.util.Arrays;
import java.util.List;

public class Conversion {

    public static void main(String... args) {
        String[] days = {"Monday", "Tuesday"};
        System.out.println("[" + days[0] + ", " + days[1] + "]");

        List<String> daysAsList = Arrays.asList(days);
        System.out.println(daysAsList);

        daysAsList.set(1, "Thursday");
        System.out.println(daysAsList);
        System.out.println("[" + days[0] + ", " + days[1] + "]");
    }
}
