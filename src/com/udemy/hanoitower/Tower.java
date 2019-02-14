package com.udemy.hanoitower;

public class Tower {

    public void solveHanoi(int n, char rodFrom, char rodMiddle, char rodTo) {
        if (n == 1) {
            System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
            return;
        }

        solveHanoi(n - 1, rodFrom, rodTo, rodMiddle);
        System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
        solveHanoi(n - 1, rodMiddle, rodFrom, rodTo);
    }
}

