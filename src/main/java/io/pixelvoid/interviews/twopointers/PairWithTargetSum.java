package io.pixelvoid.interviews.twopointers;

/**
 * Finds the indexes of two values in a sorted array whose sum matches a target.
 *
 * Pattern: Two Pointers
 * Time: O(n)
 * Space: O(1)
 */
public final class PairWithTargetSum {

    private PairWithTargetSum() {
    }

    public static int[] findPair(int[] sortedNumbers, int target) {
        if (sortedNumbers == null) {
            throw new IllegalArgumentException("sortedNumbers must not be null");
        }

        int left = 0;
        int right = sortedNumbers.length - 1;

        while (left < right) {
            int sum = sortedNumbers[left] + sortedNumbers[right];
            if (sum == target) {
                return new int[]{left, right};
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
