package com.udemy.search;

public class Search {

    private int[] arr;

    public Search(int[] arr) {
        this.arr = arr;
    }

    public int linearSearch(int item) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == item) return i;
            i++;
        }

        return -1;
    }

    public int binarySearch(int item) {
        return binarySearch(0, arr.length - 1, item);
    }

    private int binarySearch(int startIndex, int endIndex, int item) {
        if (endIndex < startIndex) {
            System.out.println("Item is not present in the array");
            return -1;
        }

        int middleIndex = (startIndex + endIndex) / 2;

        if (arr[middleIndex] == item) {
            return middleIndex;
        }
        else if (item < arr[middleIndex]) {
            return binarySearch(startIndex, middleIndex - 1, item);
        }
        else {
            return binarySearch(middleIndex + 1, startIndex, item);
        }
    }
}

