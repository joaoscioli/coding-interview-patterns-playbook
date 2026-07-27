package io.pixelvoid.interviews.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaximumSumSubarrayTest {

    @Test
    void returnsMaximumSumForFixedWindow() {
        assertEquals(9, MaximumSumSubarray.findMaximumSum(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }

    @Test
    void supportsNegativeValues() {
        assertEquals(-3, MaximumSumSubarray.findMaximumSum(new int[]{-4, -2, -1, -7}, 2));
    }

    @Test
    void rejectsInvalidWindowSize() {
        assertThrows(IllegalArgumentException.class,
                () -> MaximumSumSubarray.findMaximumSum(new int[]{1, 2}, 3));
    }
}
