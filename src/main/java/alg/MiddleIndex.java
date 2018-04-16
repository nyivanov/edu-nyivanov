package alg;

/**
 * Description:
 * You are given an array of numbers. Find out the array index or position
 * where sum of numbers preceeding the index is equals to sum of numbers
 * succeeding the index.
 */
public class MiddleIndex {
    public static void main(String... args) {
        final int[] nums = {2, 4, 4, 6, 5, 4, 1, 6};
        System.out.println(findIndex(nums));
    }

    private static int findIndex(final int[] pNumbers) {
        int middleIndex = -1;
        if (pNumbers == null) {
            throw new IllegalArgumentException("Please provide an array of numbers");
        }
        int length = pNumbers.length;
        for (int i = 0; i < length; i++) {
            if (calcSum(i, pNumbers, Direction.LEFT) == calcSum(i, pNumbers, Direction.RIGHT)) {
                middleIndex = i;
                break;
            }
        }
        if (middleIndex == -1) {
            throw new IllegalArgumentException("Please provide an array of numbers matching the requirements");
        }
        return middleIndex;
    }

    private static int calcSum(final int pIndex, final int[] pNumbers, final Direction pDirection) {
        int sum = 0;
        if (pDirection == Direction.LEFT) {
            for (int i = 0; i <= pIndex; i++) {
                sum += pNumbers[i];
            }
        } else {
            int length = pNumbers.length;
            for (int i = pIndex + 1; i < length; i++) {
                sum += pNumbers[i];
            }
        }
        return sum;
    }
}

enum Direction {LEFT, RIGHT}