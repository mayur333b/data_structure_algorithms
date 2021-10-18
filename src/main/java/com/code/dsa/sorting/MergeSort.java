package com.code.dsa.sorting;

public class MergeSort {

    public void sort(int[] input, int l, int r) {

        if (l < r) {
            int mid = l + (r - l) / 2;
            sort(input, l, mid);
            sort(input, mid + 1, r);
            merge(input, l, mid, r);
        }

    }

    private void merge(int[] input, int l, int mid, int r) {
        //create two temp arrays
        int length1 = mid - l + 1;
        int length2 = r - mid;
        int[] temp1 = new int[length1];
        int[] temp2 = new int[length2];

        for (int i = 0; i < length1; i++) {
            temp1[i] = input[i + l];
        }
        for (int j = 0; j < length2; j++) {
            temp2[j] = input[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = l;
        //merging two arrays in sorted order
        while (i < length1 && j < length2) {
            if (temp1[i] <= temp2[j]) {
                input[k++] = temp1[i++];
            } else {
                input[k++] = temp2[j++];
            }
        }

        while (i < length1) {
            input[k++] = temp1[i++];
        }

        while (j < length2) {
            input[k++] = temp2[j++];
        }
    }
}
