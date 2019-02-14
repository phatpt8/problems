package com.udemy.queenproblem;

public class QueenProblem {
    private int[][] table;
    private int numsOfQueens;

    public QueenProblem(int numsOfQueens) {
        this.table = new int[numsOfQueens][numsOfQueens];
        this.numsOfQueens = numsOfQueens;
    }

    public void solve() {
        if (setQueen(0)) {
            printQueen();
        } else {
            System.out.println("There is no solution");
        }
    }

    private boolean setQueen(int colIndex) {
        if (colIndex == numsOfQueens) {
            return true;
        }
        for (int rowIndex = 0; rowIndex < numsOfQueens; rowIndex++) {
            if (isPlaceValid(rowIndex, colIndex)) {
                table[rowIndex][colIndex] = 1;

                if (setQueen(colIndex + 1)) {
                    return true;
                }

                // BACKTRACKING
                table[rowIndex][colIndex] = 0;
            }
        }

        return false;
    }

    private boolean isPlaceValid(int rowIndex, int colIndex) {

        for (int i = 0; i < colIndex; i++) {
            if (table[rowIndex][i] == 1) {
                return false;
            }
        }

        for (int i = rowIndex, j = colIndex; i >= 0 && j >= 0; i--, j--) {
            if (table[i][j] == 1) {
                return false;
            }
        }

        for (int i = rowIndex, j = colIndex; i < table.length && j >= 0; i++, j--) {
            if (table[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private void printQueen() {

        for (int i=0; i < numsOfQueens;i++) {
            for (int j=0;j < numsOfQueens;j++) {
                if (table[i][j] == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }

            System.out.println();
        }
    }
}

