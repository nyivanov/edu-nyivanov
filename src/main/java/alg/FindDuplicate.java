package alg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Description:
 * You have got a range of numbers between 1 to N, where one of the number is
 * repeated. You need to write a program to find out the duplicate number.
 */
public class FindDuplicate {
    public static void main(String... args) {
        System.out.println(findDuplicate(newArray(30, 4)));
    }

    private static int findDuplicate(final List<Integer> pNums) {
        pNums.sort(Comparator.naturalOrder());
        for (int i = 0; i < pNums.size(); i++) {
            Integer currentVal = pNums.get(i);
            if ((i + 1) != currentVal) {
                return currentVal;
            }
        }
        return -1;
    }

    private static List<Integer> newArray(final int pCount, final int pDuplicate) {
        final List<Integer> nums = new ArrayList<>();
        for (int i = 1; i < pCount; i++) {
            nums.add(i);
        }
        nums.add(pDuplicate);
        return nums;
    }
}
