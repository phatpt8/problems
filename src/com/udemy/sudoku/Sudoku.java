package com.udemy.sudoku;

public class Sudoku {
    private int[][] sudokuTable;

    public Sudoku(int[][] sudokuTable) {
        this.sudokuTable = sudokuTable;
    }

    public void solveProblem() {
        if (solve(0, 0)) {
            showResult();
        } else {
            System.out.println("No solution");
        }
    }

    private boolean solve(int row, int col) {
        System.out.println("Solving: " + row +","+col);
        if (row == Constant.BOARD_SIZE && ++col == Constant.BOARD_SIZE) {
            return true;
        }
        if (row == Constant.BOARD_SIZE) {
            row = 0;
        }
        if (sudokuTable[row][col] != 0) {
            return solve(row + 1, col);
        }

        for (int number = Constant.MIN_NUMBER; number <= Constant.MAX_NUMBER; number++) {
            if (isValid(row, col, number)) {
                sudokuTable[row][col] = number;

                if (solve(row + 1, col)) {
                    return true;
                }

                // BACKTRACK
                sudokuTable[row][col] = 0;
            }
        }

        return false;
    }

    private boolean isValid(int row, int col, int number) {
        for (int index = 0; index < Constant.BOARD_SIZE; index++) {
            if (sudokuTable[index][row] == number) {
                return false;
            }
            if (sudokuTable[col][index] == number) {
                return false;
            }
        }

        int boxRowOffset = (col / 3) * Constant.BOX_SIZE;
        int boxColOffset = (row / 3) * Constant.BOX_SIZE;

        for (int i = 0; i < Constant.BOX_SIZE; i++) {
            for (int j = 0; j < Constant.BOX_SIZE; j++) {
                if (number == sudokuTable[boxRowOffset + i][boxColOffset + j]) {
                    return false;
                }
            }
        }

        return true;
    }

    private void showResult() {
        for (int i = 0; i < Constant.BOARD_SIZE; i++) {
            if (i % 3 == 0) System.out.println(" ");

            for (int j = 0; j < Constant.BOARD_SIZE; j++) {
                if (i % 3 == 0) System.out.println(" ");
                System.out.print(sudokuTable[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
