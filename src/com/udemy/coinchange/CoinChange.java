package com.udemy.coinchange;

public class CoinChange {

    public int naiveCoinChange(int m, int[] v, int index) {
        if (m < 0) return 0;
        if (m == 0) return 1;
        if (v.length == index) return 0;

        return naiveCoinChange(m - v[index], v, index) + naiveCoinChange(m, v, index + 1);
    }

    public void dpCoinChange(int m, int[] v) {
        int[][] table = new int[v.length + 1][m + 1];
        for (int i = 0; i < v.length; i++) {
            table[i][0]
        }
    }
}
