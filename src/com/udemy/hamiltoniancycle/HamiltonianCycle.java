package com.udemy.hamiltoniancycle;

public class HamiltonianCycle {
    private int numOfVertexes;
    private int[] hamiltonPath;
    private int[][] adjacencyMatrix;

    public HamiltonianCycle(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.hamiltonPath = new int[adjacencyMatrix.length];
        this.numOfVertexes = adjacencyMatrix.length;

        this.hamiltonPath[0] = 0;
    }

    public void solve() {
        if (findFeasibleSolution(1)) {
            showHamiltonPath();
        } else {
            System.out.println("No Feasible Solution");
        }
    }

    private boolean findFeasibleSolution(int position) {
        if (position == numOfVertexes) {
            if (adjacencyMatrix[hamiltonPath[position - 1]][hamiltonPath[0]] == 1) {
                return true;
            } else {
                return false;
            }
        }

        for (int vertexIndex = 1; vertexIndex < numOfVertexes; vertexIndex++) {
            if (isFeasible(vertexIndex, position)) {
                hamiltonPath[position] = vertexIndex;

                if (findFeasibleSolution(position + 1)) {
                    return true;
                }

                // BACKTRACK

            }
        }

        return false;
    }

    private boolean isFeasible(int vertexIndex, int position) {
        if (adjacencyMatrix[hamiltonPath[position - 1]][vertexIndex] == 0) {
            return false;
        }

        for (int i = 0;i < position;i++) {
            if(hamiltonPath[i] == vertexIndex) {
                return false;
            }
        }

        return true;
    }

    private void showHamiltonPath() {
        System.out.println("Hamilton cycle: ");

        for (int i = 0; i < hamiltonPath.length; i++) {
            System.out.print(hamiltonPath[i] + " ");
        }
        System.out.println(hamiltonPath[0]);
    }
}
