package com.udemy.sort;

import java.util.Random;

public class Quickselect {

    private int[] nums;

    public Quickselect(int[] nums) {
        this.nums = nums;
    }

    public int select(int k) {
        return select(0, nums.length - 1, k - 1);
    }

    private int select(int firstIndex, int lastIndex, int k) {
        int pivot = partition(firstIndex, lastIndex);

        if (pivot > k) {
            return select(firstIndex, pivot - 1, k);
        } else if (pivot < k) {
            return select(pivot + 1, lastIndex, k);
        }

        return nums[k];
    }

    private int partition(int firstIndex, int lastIndex) {
        int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;

        swap(lastIndex, pivot);

        for (int i = firstIndex; i < lastIndex; i++) {
            if (nums[i] > nums[lastIndex]) { // change ">" or "<" to get largest item or smallest item respectively
                swap(i, firstIndex);
                firstIndex++;
            }
        }

        swap(firstIndex, lastIndex);

        return firstIndex;
    }

    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

