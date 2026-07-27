package io.pixelvoid.interviews.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PairWithTargetSumTest {

    @Test
    void returnsIndexesWhenPairExists() {
        assertArrayEquals(new int[]{1, 3}, PairWithTargetSum.findPair(new int[]{1, 2, 3, 4, 6}, 6));
    }

    @Test
    void returnsSentinelWhenPairDoesNotExist() {
        assertArrayEquals(new int[]{-1, -1}, PairWithTargetSum.findPair(new int[]{1, 2, 3}, 20));
    }

    @Test
    void rejectsNullInput() {
        assertThrows(IllegalArgumentException.class, () -> PairWithTargetSum.findPair(null, 5));
    }
}
