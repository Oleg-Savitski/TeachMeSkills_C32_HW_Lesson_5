package com.teachmeskills.lesson_5;

/** Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */

public class Task_2_Lesson_5 {
    public static void main(String[] args) {
        int[][] firstMatrix = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
        };

        int[][] secondMatrix = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        int rowsFirst = firstMatrix.length;
        int colsFirst = firstMatrix[0].length;
        int colsSecond = secondMatrix[0].length;

        int[][] result = new int[rowsFirst][colsSecond];

        for(int i=0; i < rowsFirst; i++) {
            for(int j=0; j < colsSecond; j++) {
                for(int k =0; k < colsFirst; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        for(int[] row : result) {
            for(int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}