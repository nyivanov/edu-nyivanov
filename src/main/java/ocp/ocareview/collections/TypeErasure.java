package ocp.ocareview.collections;


import java.util.ArrayList;
import java.util.List;

public class TypeErasure {
    public static void main(String... args){
        List names = new ArrayList();
        names.add("test");

        printIntegers(names); // Will produce class cast exception
    }

    private static void printIntegers(final List<Integer> pNumbers){
        for (Integer pNumber : pNumbers) {
            System.out.println(pNumber);
        }
    }
}
