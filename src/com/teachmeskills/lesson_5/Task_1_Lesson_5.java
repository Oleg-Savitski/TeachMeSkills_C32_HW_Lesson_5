package com.teachmeskills.lesson_5;

/** Шахматная доска
 * Создать программу для раскраски шахматной доски с помощью цикла.
 * Создать двумерный массив String'ов 8х8. С помощью циклов задать
 * элементам циклам значения B(Black) или W(White). Результат работы
 * программы:
 W B W B W B W B
 B W B W B W B W
 W B W B W B W B
 B W B W B W B W
 W B W B W B W B
 B W B W B W B W
 W B W B W B W B
 B W B W B W B W
 */

public class Task_1_Lesson_5 {
    public static void main(String[] args) {
        String[][] board = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
        }
        for (String[] row : board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}