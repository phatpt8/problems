package com.udemy.knighttour;

public class KnightTour {
    private int[][] solutionMatrix;
    private int[] xMoves = {2,1,-1,-2,-2,-1,1,2};
    private int[] yMoves = {1,2,2,1,-1,-2,-2,-1};

    public KnightTour() {
        this.solutionMatrix = new int[Constant.BOARD_SIZE][Constant.BOARD_SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0;i < Constant.BOARD_SIZE; i++) {
            for (int j = 0; j < Constant.BOARD_SIZE; j++) {
                solutionMatrix[i][j] = -1;
            }
        }
    }

    public void solveTour() {
        solutionMatrix[0][0] = 1;

        if (solve(2, 0, 0)) {
            printSolution();
        } else {
            System.out.println("No solution...");
        }
    }

    private boolean solve(int stepCount, int x, int y) {
        if (stepCount == Constant.BOARD_SIZE * Constant.BOARD_SIZE + 1) {
            return true;
        }

        for (int i = 0; i < Constant.NUM_OF_MOVE; i++) {
            int nextX = x + xMoves[i];
            int nextY = y + yMoves[i];

            if (isStepValid(nextX, nextY)) {
                solutionMatrix[nextX][nextY] = stepCount;

                if (solve(stepCount + 1, nextX, nextY)) {
                    return true;
                }

                // BACKTRACK
                solutionMatrix[nextX][nextY] = -1;
            }
        }

        return false;
    }

    private boolean isStepValid(int x, int y) {
        if (x < 0 || x >= Constant.BOARD_SIZE) return false;
        if (y < 0 || y >= Constant.BOARD_SIZE) return false;
        if (solutionMatrix[x][y] != -1) return false;

        return true;
    }

    private void printSolution() {
        for (int i = 0;i < Constant.BOARD_SIZE; i++) {
            for (int j = 0; j < Constant.BOARD_SIZE; j++) {
                System.out.print(solutionMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

