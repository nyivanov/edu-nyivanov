package ocp.ocareview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceStreams {
    public static void main(String... args) {
        List<Integer> nums = Arrays.asList(5, 6, 10, 1, 23);
        nums.parallelStream().reduce((a, b) -> a * b).ifPresent(System.out::println);

        Stream<Integer> integerStream = Stream.of(5, 6, 10, 1, 23);
        Integer multiplied = integerStream.reduce(1, (a, b) -> a * b);
        System.out.println(multiplied);

        Stream<String> stringStream = Stream.of("a", "b", "c", "d");
        System.out.println(stringStream.reduce("", (a, b) -> b + a));
    }
}