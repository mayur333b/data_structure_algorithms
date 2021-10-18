package com.code.dsa.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {
    MergeSort mergeSort = new MergeSort();

    @Test
    void testSort() {
        int[] input = {38, 27, 43, 3, 9, 82, 10};
        int[] output = {3, 9, 10, 27, 38, 43, 82};

        mergeSort.sort(input, 0, input.length - 1);
        Assertions.assertEquals(Arrays.compare(input, output), 0);
    }

    @Test
    void testSortWithNegativeNumbers() {
        int[] input = {38, -27, -43, 3, 9, 82, 10};
        int[] output = {-43, -27, 3, 9, 10, 38, 82};

        mergeSort.sort(input, 0, input.length - 1);
        Assertions.assertEquals(Arrays.compare(input, output), 0);
    }

    @Test
    void testSortEmpty() {
        int[] input = {};
        int[] output = {};

        mergeSort.sort(input, 0, input.length - 1);
        Assertions.assertEquals(Arrays.compare(input, output), 0);
    }

    @Test
    void testSortForSingleElement() {
        int[] input = {2};
        int[] output = {2};

        mergeSort.sort(input, 0, input.length - 1);
        Assertions.assertEquals(Arrays.compare(input, output), 0);
    }
}
