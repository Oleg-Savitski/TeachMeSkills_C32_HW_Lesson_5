package com.teachmeskills.lesson_5;

/** Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * всех элементов массива.
 */

public class Task_3_Lesson_5 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 6},
                {4, 7, 6, 7},
                {7, 8, 9, 8, 9, 9}
        };

        int sum = 0;


        for (int[] row : array){
            for(int value : row){
                sum += value;
            }
        }

        System.out.println("The sum of all the elements of the array: " + sum);
    }
}