package io.pixelvoid.interviews.slidingwindow;

/**
 * Finds the maximum sum among all contiguous subarrays of a fixed size.
 *
 * Pattern: Sliding Window
 * Time: O(n)
 * Space: O(1)
 */
public final class MaximumSumSubarray {

    private MaximumSumSubarray() {
    }

    public static int findMaximumSum(int[] numbers, int windowSize) {
        if (numbers == null) {
            throw new IllegalArgumentException("numbers must not be null");
        }
        if (windowSize <= 0 || windowSize > numbers.length) {
            throw new IllegalArgumentException("windowSize must be between 1 and the array length");
        }

        int currentSum = 0;
        for (int index = 0; index < windowSize; index++) {
            currentSum += numbers[index];
        }

        int maximumSum = currentSum;
        for (int right = windowSize; right < numbers.length; right++) {
            currentSum += numbers[right] - numbers[right - windowSize];
            maximumSum = Math.max(maximumSum, currentSum);
        }

        return maximumSum;
    }
}
