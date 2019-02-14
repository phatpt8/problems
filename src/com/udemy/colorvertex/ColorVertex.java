package com.udemy.colorvertex;

public class ColorVertex {
    private int numOfVertexes;
    private int numOfColors;
    private int[] colors;
    private int[][] adjacencyMatrix;

    public ColorVertex(int[][] adjacencyMatrix, int numOfColors) {
        this.numOfColors = numOfColors;
        this.adjacencyMatrix = adjacencyMatrix;
        this.numOfVertexes = adjacencyMatrix.length;
        this.colors = new int[numOfVertexes];
    }

    public void solve() {
        if (solveProblem(0)) {
            showResult();
        } else {
            System.out.println("No solution.");
        }
    }

    private void showResult() {
        int i = 0;
        while (i < numOfVertexes) {
            System.out.println("Node " + (i + 1) + " has color index" + colors[i]);
            i++;
        }
    }

    private boolean solveProblem(int nodeIndex) {
        if (nodeIndex == numOfVertexes) {
            return true;
        }

        for (int colorIndex = 1; colorIndex <= numOfColors;colorIndex++) {
            if (isColorValid(nodeIndex, colorIndex)) {
                colors[nodeIndex] = colorIndex;

                if (solveProblem(nodeIndex + 1)) {
                    return true;
                }

                // BACKTRACK

            }
        }

        return false;
    }

    private boolean isColorValid(int nodeIndex, int colorIndex) {
        for (int i = 0; i < numOfVertexes; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1 && colorIndex == colors[i]) {
                return false;
            }
        }

        return true;
    }
}

