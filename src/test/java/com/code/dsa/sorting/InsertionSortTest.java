package com.code.dsa.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
    InsertionSort insertionSort = new InsertionSort();

    @Test
    void testSort() {
        int[] input = {38, 27, 43, 3, 9, 82, 10};
        int[] output = {3, 9, 10, 27, 38, 43, 82};

        insertionSort.sort(input);
        Assertions.assertArrayEquals(input, output);
    }

    @Test
    void testSortWithNegativeNumbers() {
        int[] input = {38, -27, -43, 3, 9, 82, 10};
        int[] output = {-43, -27, 3, 9, 10, 38, 82};

        insertionSort.sort(input);
        Assertions.assertArrayEquals(input, output);
    }

    @Test
    void testSortEmpty() {
        int[] input = {};
        int[] output = {};

        insertionSort.sort(input);
        Assertions.assertArrayEquals(input, output);
    }

    @Test
    void testSortForSingleElement() {
        int[] input = {2};
        int[] output = {2};

        insertionSort.sort(input);
        Assertions.assertArrayEquals(input, output);
    }
}