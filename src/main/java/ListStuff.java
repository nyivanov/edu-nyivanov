import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListStuff {
    public static void main(String... args) {
        System.out.println(getRandomSubset(Arrays.asList(1, 4, 5, 9)));
    }

    private static List<Integer> getRandomSubset(final List<Integer> pNumbers) {
        if (pNumbers == null) {
            throw new IllegalArgumentException("Input data is not correct!");
        }
        final int allSubsetsCount = (int) Math.pow(2, pNumbers.size());
        List<List<Integer>> subsets = findSubsets(pNumbers);
        final Random randomGen = new Random();
        int anInt = randomGen.nextInt(allSubsetsCount);
        return subsets.get(anInt);
    }

    private static List<List<Integer>> findSubsets(List<Integer> pNumbers) {
        List<List<Integer>> result = new ArrayList<>();
        if (pNumbers.isEmpty()) {
            result.add(new ArrayList<>());
            return result;
        }
        List<Integer> list = new ArrayList<>(pNumbers);
        Integer head = list.get(0);
        List<Integer> rest = new ArrayList<>(list.subList(1, list.size()));
        for (List<Integer> set : findSubsets(rest)) {
            List<Integer> newSet = new ArrayList<>();
            newSet.add(head);
            newSet.addAll(set);
            result.add(newSet);
            result.add(set);
        }
        return result;
    }
}
