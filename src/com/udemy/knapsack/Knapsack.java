package com.udemy.knapsack;

public class Knapsack {
    private int numOfItems;
    private int capacity;
    private int[][] knapsackTable;
    private int totalBenefit;
    private int[] weights;
    private int[] values;

    public Knapsack(int numOfItems, int capacity, int[] weights, int[] values) {
        this.numOfItems = numOfItems;
        this.capacity = capacity;
        this.weights = weights;
        this.values = values;
        this.knapsackTable = new int[numOfItems + 1][capacity + 1];
    }

    public void solve() {
        for (int i = 1; i < numOfItems + 1; i++) {
            for (int w = 1; w < capacity + 1; w++) {
                int notTakingItem = knapsackTable[i - 1][w];
                int takingItem = 0;

                if (weights[i] <= w) {
                    takingItem = values[i] + knapsackTable[i - 1][w - weights[i]];
                }

                knapsackTable[i][w] = Math.max(notTakingItem, takingItem);
            }
        }
        totalBenefit = knapsackTable[numOfItems][capacity];
    }

    public void showResult() {
        System.out.println("Total benefit: " + totalBenefit);
        for (int i = numOfItems, w = capacity; i > 0; i--) {
            if (knapsackTable[i][w] != 0 && knapsackTable[i][w] != knapsackTable[i - 1][w]) {
                System.out.println("We take item: #" + i);
                w = w - weights[i];
            }
        }
    }
}

