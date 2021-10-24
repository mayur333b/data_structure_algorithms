package com.code.dsa.sorting;

public class BubbleSort {
    public void sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    //swap numbers
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }
}
