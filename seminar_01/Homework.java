package seminar_01;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 10)); // true
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(0)); // false
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2020)); // true
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true


        int[] arr = createArray(5, 10);
        System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]

        int[] arr1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr1)); // [1, 1, 0, 0, 1, 0, 1, 1, 0, 0]
        change01Array(arr1);
        System.out.println(Arrays.toString(arr1)); // [0, 0, 1, 1, 0, 1, 0, 0, 1, 1]

        int[] arr2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr2)); // [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]
        changeLess6Array(arr2);
        System.out.println(Arrays.toString(arr2)); // [2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2]

        int[][] array = diagonalMatrix(5,5);
        for (int i =0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                System.out.printf("%d", array[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if (a+b>=10 && a+b<=20) return true;
        return false;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x>0) return true;
        return false;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for(int i = 0; i<repeat; i++){
            System.out.println(source);
        }
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if (year%4==0){
            if (year%100 == 0){
                if (year%400 == 0) return true;
                return false;
            }
            return true;
        }
        return false;
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i =0; i<len; i++) {
            arr[i] = initialValue;
        }
        return arr;
        //return null;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;**/
    private static void change01Array(int[] array) {
        int[] arr = array;
        for (int i =0; i<arr.length; i++) {
            if (arr[i]==0) arr[i] = 1;
            else arr[i]=0;
        }
    }

    /**
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     *  и числа меньшие 6 умножить на 2;**/
    private static void changeLess6Array(int[] array) {
        int[] arr = array;
        for (int i =0; i<arr.length; i++) {
            if (arr[i]<6) arr[i] = arr[i]*2;
        }
    }

    /*
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
     * диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
     * то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
    private static int[][] diagonalMatrix(int len1, int len2) {
        int[][] matrix = new int[len1][len2];
        for (int i =0; i<len1; i++) {
            for (int j=0; j<len2; j++) {
                if (i == j || i == len2-1-j) matrix[i][j] = 1;
            }
        }
        return matrix;
    }


    /* 4. Подготовить вопросы к следующему уроку.
     */
}