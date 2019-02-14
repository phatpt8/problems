package com.udemy;

import com.udemy.coinchange.CoinChange;
import com.udemy.colorvertex.ColorVertex;
import com.udemy.hamiltoniancycle.HamiltonianCycle;
import com.udemy.hanoitower.Tower;
import com.udemy.iterative.Algorithm;
import com.udemy.knapsack.Knapsack;
import com.udemy.knighttour.KnightTour;
import com.udemy.maze.Maze;
import com.udemy.queenproblem.QueenProblem;
import com.udemy.search.Search;
import com.udemy.sort.Quickselect;
import com.udemy.sudoku.Sudoku;

public class Main {

    public static void main(String[] args) {
//        Algorithm alg = new Algorithm();
//        System.out.println(alg.factorial(5));

//        int[] array = {1, 5, 6, 2, 5, 8, -3, 0, 4};
//        int[] array = {1,3,4,7,8,9,10};
//        Search s = new Search(array);
//        System.out.println(s.linearSearch(8));
//        System.out.println(s.binarySearch(3));

//        Tower t = new Tower();
//        t.solveHanoi(3, 'A', 'B', 'C');

//        int[] array = {1,5,4,8,-2};
//        Quickselect qs = new Quickselect(array);
//        System.out.println(qs.select(2));


//        QueenProblem queenProblem = new QueenProblem(5);
//        queenProblem.solve();

//        int[][] matrix = {
//                {0, 1, 1, 1, 0, 0},
//                {1, 0, 1, 0, 1, 0},
//                {1, 1, 1, 1, 0, 1},
//                {1, 0, 1, 0, 0, 1},
//                {0, 1, 0, 0, 0, 1},
//                {0, 1, 1, 1, 1, 1},
//        };
//        HamiltonianCycle hc = new HamiltonianCycle(matrix);
//        hc.solve();

//        ColorVertex cv = new ColorVertex(matrix, 4);
//        cv.solve();

//        KnightTour kt = new KnightTour();
//        kt.solveTour();

//        int[][] mazeTable = {
//                {1, 1, 1, 1, 1},
//                {1, 0, 0, 1, 0},
//                {0, 0, 0, 1, 0},
//                {1, 1, 1, 1, 1},
//                {1, 1, 1, 0, 1}
//        };
//        Maze m = new Maze(mazeTable);
//        m.solve();

// Sudoku output is not correct to the demonstration
//        int[][] table = {
//                {3,0,6,5,0,8,4,0,0},
//                {5,2,0,0,0,0,0,0,0},
//                {0,8,7,0,0,0,0,3,1},
//                {0,0,3,0,1,0,0,8,0},
//                {9,0,0,8,6,3,0,0,5},
//                {0,5,0,0,9,0,6,0,0},
//                {1,3,0,0,0,0,2,5,0},
//                {0,0,0,0,0,0,0,7,4},
//                {0,0,5,2,0,6,3,0,0}
//        };
//        Sudoku sudoku = new Sudoku(table);
//        sudoku.solveProblem();

//        int numOfItems = 3;
//        int capacity = 5;
//        int[] weightOfItems = new int[numOfItems + 1];
//        weightOfItems[1] = 4;
//        weightOfItems[2] = 2;
//        weightOfItems[3] = 3;
//
//        int[] profit = new int[numOfItems + 1];
//        profit[1] = 10;
//        profit[2] = 4;
//        profit[3] = 7;
//
//        Knapsack ks = new Knapsack(numOfItems, capacity, weightOfItems, profit);
//        ks.solve();
//        ks.showResult();

        int[] v = {1, 2, 3};
        int m = 5;
        CoinChange cc = new CoinChange();
        System.out.println(cc.naiveCoinChange(m, v, 0));
    }
}
