package com.teachmeskills.lesson_5;

import java.util.Scanner;

/** Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */

public class Task_0_Lesson_5 {
    public static void main(String[] args) {
        int[][][] array = new int[2][3][4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                for(int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }

        System.out.println("Enter the number to increase: ");
        int increment = scanner.nextInt();

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                for(int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += increment;
                }
            }
        }

        for(int[][] twoArray : array) {
            for (int[] oneArray : twoArray) {
                for(int value : oneArray) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }
}