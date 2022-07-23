package com.code.dsa.sorting;

public class SelectionSort {
    //select small element from array and move it to one end
    public void sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minimum]) {
                    minimum = j;
                }
            }
            //swap numbers
            int temp = input[minimum];
            input[minimum] = input[i];
            input[i] = temp;
        }
    }
}
